package Windows.Networking.PushNotifications

import Windows.Storage.Streams.IBuffer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRawNotification3.ABI::class)
@Signature("{62737dde-8a73-424c-ab44-5635f40a96e5}")
@Guid("62737dde8a73424cab445635f40a96e5")
@WinRTInterface("62737dde8a73424cab445635f40a96e5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRawNotification3.ByReference::class)
public interface IRawNotification3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContentBytes(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRawNotification3> {
    public override fun getValue() = ABI.makeIRawNotification3(pointer.getPointer(0))

    public fun setValue(value: IRawNotification3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRawNotification3 {
    public val __1215362698_Ptr: Pointer?

    public val _1215362698_VtblPtr: Pointer?
      get() = __1215362698_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentBytes(): IBuffer? {
      val fnPtr = _1215362698_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1215362698_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IRawNotification3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1215362698_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRawNotification3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("62737dde8a73424cab445635f40a96e5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRawNotification3(ptr: Pointer?): WithDefault = IRawNotification3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRawNotification3 {
      val address = segment.toRawLongValue()
      return makeIRawNotification3(Pointer(address))
    }

    public override fun toNative(obj: IRawNotification3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1215362698_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRawNotification3): Array<IRawNotification3?> = (elements
        as Array<IRawNotification3?>).castToImpl<IRawNotification3,IRawNotification3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRawNotification3?> =
        arrayOfNulls<IRawNotification3_Impl>(size) as Array<IRawNotification3?>
  }
}
