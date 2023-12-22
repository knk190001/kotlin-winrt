package Windows.UI.Input.Spatial

import Windows.Devices.Haptics.SimpleHapticsController
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpatialInteractionController.ABI::class)
@Signature("{5f0e5ba3-0954-4e97-86c5-e7f30b114dfd}")
@Guid("5f0e5ba309544e9786c5e7f30b114dfd")
@WinRTInterface("5f0e5ba309544e9786c5e7f30b114dfd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialInteractionController.ByReference::class)
public interface ISpatialInteractionController : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HasTouchpad(): Boolean

  @InterfaceMethod(1)
  public fun get_HasThumbstick(): Boolean

  @InterfaceMethod(2)
  public fun get_SimpleHapticsController(): SimpleHapticsController?

  @InterfaceMethod(3)
  public fun get_VendorId(): WinDef.USHORT

  @InterfaceMethod(4)
  public fun get_ProductId(): WinDef.USHORT

  @InterfaceMethod(5)
  public fun get_Version(): WinDef.USHORT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialInteractionController> {
    public override fun getValue() = ABI.makeISpatialInteractionController(pointer.getPointer(0))

    public fun setValue(value: ISpatialInteractionController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialInteractionController {
    public val __192723522_Ptr: Pointer?

    public val _192723522_VtblPtr: Pointer?
      get() = __192723522_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HasTouchpad(): Boolean {
      val fnPtr = _192723522_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__192723522_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_HasThumbstick(): Boolean {
      val fnPtr = _192723522_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__192723522_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_SimpleHapticsController(): SimpleHapticsController? {
      val fnPtr = _192723522_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SimpleHapticsController>()
      val hr = fn.invokeHR(arrayOf(__192723522_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SimpleHapticsController>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_VendorId(): WinDef.USHORT {
      val fnPtr = _192723522_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__192723522_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_ProductId(): WinDef.USHORT {
      val fnPtr = _192723522_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__192723522_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_Version(): WinDef.USHORT {
      val fnPtr = _192723522_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__192723522_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }
  }

  public class ISpatialInteractionController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __192723522_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialInteractionController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5f0e5ba309544e9786c5e7f30b114dfd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialInteractionController(ptr: Pointer?): WithDefault =
        ISpatialInteractionController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialInteractionController {
      val address = segment.toRawLongValue()
      return makeISpatialInteractionController(Pointer(address))
    }

    public override fun toNative(obj: ISpatialInteractionController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__192723522_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialInteractionController):
        Array<ISpatialInteractionController?> = (elements as
        Array<ISpatialInteractionController?>).castToImpl<ISpatialInteractionController,ISpatialInteractionController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialInteractionController?> =
        arrayOfNulls<ISpatialInteractionController_Impl>(size) as
        Array<ISpatialInteractionController?>
  }
}
