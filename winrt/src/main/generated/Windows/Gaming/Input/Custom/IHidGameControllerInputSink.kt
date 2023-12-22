package Windows.Gaming.Input.Custom

import Windows.Gaming.Input.Custom.IGameControllerInputSink.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHidGameControllerInputSink.ABI::class)
@Signature("{f754c322-182d-40e4-a126-fcee4ffa1e31}")
@Guid("f754c322182d40e4a126fcee4ffa1e31")
@WinRTInterface("f754c322182d40e4a126fcee4ffa1e31")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHidGameControllerInputSink.ByReference::class)
public interface IHidGameControllerInputSink : NativeMapped, IWinRTInterface,
    IGameControllerInputSink {
  @InterfaceMethod(0)
  public fun OnInputReportReceived(
    timestamp: WinDef.ULONG,
    reportId: Byte,
    reportBuffer: Array<Byte>
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHidGameControllerInputSink> {
    public override fun getValue() = ABI.makeIHidGameControllerInputSink(pointer.getPointer(0))

    public fun setValue(value: IHidGameControllerInputSink_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHidGameControllerInputSink, IGameControllerInputSink.WithDefault {
    public val __1218140948_Ptr: Pointer?

    public val _1218140948_VtblPtr: Pointer?
      get() = __1218140948_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnInputReportReceived(
      timestamp: WinDef.ULONG,
      reportId: Byte,
      reportBuffer: Array<Byte>
    ): Unit {
      val fnPtr = _1218140948_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1218140948_Ptr, timestamp, reportId,
          reportBuffer.size,marshalToNative(reportBuffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHidGameControllerInputSink_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IGameControllerInputSink {
    public override val __895392785_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1218140948_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1218140948_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHidGameControllerInputSink, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f754c322182d40e4a126fcee4ffa1e31")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHidGameControllerInputSink(ptr: Pointer?): WithDefault =
        IHidGameControllerInputSink_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHidGameControllerInputSink {
      val address = segment.toRawLongValue()
      return makeIHidGameControllerInputSink(Pointer(address))
    }

    public override fun toNative(obj: IHidGameControllerInputSink): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1218140948_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHidGameControllerInputSink):
        Array<IHidGameControllerInputSink?> = (elements as
        Array<IHidGameControllerInputSink?>).castToImpl<IHidGameControllerInputSink,IHidGameControllerInputSink_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHidGameControllerInputSink?> =
        arrayOfNulls<IHidGameControllerInputSink_Impl>(size) as Array<IHidGameControllerInputSink?>
  }
}
