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

@ABIMarker(IXusbGameControllerInputSink.ABI::class)
@Signature("{b2ac1d95-6ecb-42b3-8aab-025401ca4712}")
@Guid("b2ac1d956ecb42b38aab025401ca4712")
@WinRTInterface("b2ac1d956ecb42b38aab025401ca4712")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXusbGameControllerInputSink.ByReference::class)
public interface IXusbGameControllerInputSink : NativeMapped, IWinRTInterface,
    IGameControllerInputSink {
  @InterfaceMethod(0)
  public fun OnInputReceived(
    timestamp: WinDef.ULONG,
    reportId: Byte,
    inputBuffer: Array<Byte>
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXusbGameControllerInputSink> {
    public override fun getValue() = ABI.makeIXusbGameControllerInputSink(pointer.getPointer(0))

    public fun setValue(value: IXusbGameControllerInputSink_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXusbGameControllerInputSink, IGameControllerInputSink.WithDefault
      {
    public val __89939011_Ptr: Pointer?

    public val _89939011_VtblPtr: Pointer?
      get() = __89939011_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnInputReceived(
      timestamp: WinDef.ULONG,
      reportId: Byte,
      inputBuffer: Array<Byte>
    ): Unit {
      val fnPtr = _89939011_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__89939011_Ptr, timestamp, reportId,
          inputBuffer.size,marshalToNative(inputBuffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXusbGameControllerInputSink_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IGameControllerInputSink {
    public override val __895392785_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_89939011_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __89939011_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXusbGameControllerInputSink, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b2ac1d956ecb42b38aab025401ca4712")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXusbGameControllerInputSink(ptr: Pointer?): WithDefault =
        IXusbGameControllerInputSink_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXusbGameControllerInputSink {
      val address = segment.toRawLongValue()
      return makeIXusbGameControllerInputSink(Pointer(address))
    }

    public override fun toNative(obj: IXusbGameControllerInputSink): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__89939011_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXusbGameControllerInputSink):
        Array<IXusbGameControllerInputSink?> = (elements as
        Array<IXusbGameControllerInputSink?>).castToImpl<IXusbGameControllerInputSink,IXusbGameControllerInputSink_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXusbGameControllerInputSink?> =
        arrayOfNulls<IXusbGameControllerInputSink_Impl>(size) as
        Array<IXusbGameControllerInputSink?>
  }
}
