package Windows.Gaming.Input

import Windows.Gaming.Input.IGameController.ABI.IID
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IUINavigationController.ABI::class)
@Signature("{e5aeefdd-f50e-4a55-8cdc-d33229548175}")
@Guid("e5aeefddf50e4a558cdcd33229548175")
@WinRTInterface("e5aeefddf50e4a558cdcd33229548175")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUINavigationController.ByReference::class)
public interface IUINavigationController : NativeMapped, IWinRTInterface, IGameController {
  @InterfaceMethod(0)
  public fun GetCurrentReading(): UINavigationReading?

  @InterfaceMethod(1)
  public fun GetOptionalButtonLabel(button: OptionalUINavigationButtons?):
      GameControllerButtonLabel?

  @InterfaceMethod(2)
  public fun GetRequiredButtonLabel(button: RequiredUINavigationButtons?):
      GameControllerButtonLabel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUINavigationController> {
    public override fun getValue() = ABI.makeIUINavigationController(pointer.getPointer(0))

    public fun setValue(value: IUINavigationController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUINavigationController, IGameController.WithDefault {
    public val __1981332137_Ptr: Pointer?

    public val _1981332137_VtblPtr: Pointer?
      get() = __1981332137_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentReading(): UINavigationReading? {
      val fnPtr = _1981332137_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UINavigationReading>()
      val hr = fn.invokeHR(arrayOf(__1981332137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UINavigationReading>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetOptionalButtonLabel(button: OptionalUINavigationButtons?):
        GameControllerButtonLabel? {
      val fnPtr = _1981332137_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameControllerButtonLabel>()
      val hr = fn.invokeHR(arrayOf(__1981332137_Ptr, marshalToNative(button), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameControllerButtonLabel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetRequiredButtonLabel(button: RequiredUINavigationButtons?):
        GameControllerButtonLabel? {
      val fnPtr = _1981332137_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameControllerButtonLabel>()
      val hr = fn.invokeHR(arrayOf(__1981332137_Ptr, marshalToNative(button), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameControllerButtonLabel>(result.getValue())
      return resultValue
    }
  }

  public class IUINavigationController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IGameController {
    public override val __925471711_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1981332137_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1981332137_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUINavigationController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e5aeefddf50e4a558cdcd33229548175")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUINavigationController(ptr: Pointer?): WithDefault =
        IUINavigationController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUINavigationController {
      val address = segment.toRawLongValue()
      return makeIUINavigationController(Pointer(address))
    }

    public override fun toNative(obj: IUINavigationController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1981332137_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUINavigationController): Array<IUINavigationController?>
        = (elements as
        Array<IUINavigationController?>).castToImpl<IUINavigationController,IUINavigationController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUINavigationController?> =
        arrayOfNulls<IUINavigationController_Impl>(size) as Array<IUINavigationController?>
  }
}
