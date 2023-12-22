package Windows.Networking.PushNotifications

import Windows.Foundation.Collections.IMapView
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRawNotification2.ABI::class)
@Signature("{e6d0cf19-0c6f-4cdd-9424-eec5be014d26}")
@Guid("e6d0cf190c6f4cdd9424eec5be014d26")
@WinRTInterface("e6d0cf190c6f4cdd9424eec5be014d26")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRawNotification2.ByReference::class)
public interface IRawNotification2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Headers(): IMapView<String?, String?>?

  @InterfaceMethod(1)
  public fun get_ChannelId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRawNotification2> {
    public override fun getValue() = ABI.makeIRawNotification2(pointer.getPointer(0))

    public fun setValue(value: IRawNotification2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRawNotification2 {
    public val __1215362697_Ptr: Pointer?

    public val _1215362697_VtblPtr: Pointer?
      get() = __1215362697_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Headers(): IMapView<String?, String?>? {
      val fnPtr = _1215362697_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__1215362697_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ChannelId(): String? {
      val fnPtr = _1215362697_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1215362697_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IRawNotification2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1215362697_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRawNotification2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e6d0cf190c6f4cdd9424eec5be014d26")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRawNotification2(ptr: Pointer?): WithDefault = IRawNotification2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRawNotification2 {
      val address = segment.toRawLongValue()
      return makeIRawNotification2(Pointer(address))
    }

    public override fun toNative(obj: IRawNotification2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1215362697_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRawNotification2): Array<IRawNotification2?> = (elements
        as Array<IRawNotification2?>).castToImpl<IRawNotification2,IRawNotification2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRawNotification2?> =
        arrayOfNulls<IRawNotification2_Impl>(size) as Array<IRawNotification2?>
  }
}
