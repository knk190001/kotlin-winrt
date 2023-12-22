package Windows.Gaming.Input

import Windows.Devices.Haptics.SimpleHapticsController
import Windows.Foundation.Collections.IVectorView
import Windows.Gaming.Input.IRawGameController.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRawGameController2.ABI::class)
@Signature("{43c0c035-bb73-4756-a787-3ed6bea617bd}")
@Guid("43c0c035bb734756a7873ed6bea617bd")
@WinRTInterface("43c0c035bb734756a7873ed6bea617bd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRawGameController2.ByReference::class)
public interface IRawGameController2 : NativeMapped, IWinRTInterface, IRawGameController,
    IGameController {
  @InterfaceMethod(0)
  public fun get_SimpleHapticsControllers(): IVectorView<SimpleHapticsController?>?

  @InterfaceMethod(1)
  public fun get_NonRoamableId(): String?

  @InterfaceMethod(2)
  public fun get_DisplayName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRawGameController2> {
    public override fun getValue() = ABI.makeIRawGameController2(pointer.getPointer(0))

    public fun setValue(value: IRawGameController2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRawGameController2, IRawGameController.WithDefault,
      IGameController.WithDefault {
    public val __234979567_Ptr: Pointer?

    public val _234979567_VtblPtr: Pointer?
      get() = __234979567_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SimpleHapticsControllers(): IVectorView<SimpleHapticsController?>? {
      val fnPtr = _234979567_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<SimpleHapticsController?>>()
      val hr = fn.invokeHR(arrayOf(__234979567_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<SimpleHapticsController?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NonRoamableId(): String? {
      val fnPtr = _234979567_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__234979567_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DisplayName(): String? {
      val fnPtr = _234979567_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__234979567_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IRawGameController2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IRawGameController,
      IGameController {
    public override val __1516440669_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_234979567_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __925471711_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IGameController.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_234979567_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __234979567_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRawGameController2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("43c0c035bb734756a7873ed6bea617bd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRawGameController2(ptr: Pointer?): WithDefault = IRawGameController2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRawGameController2 {
      val address = segment.toRawLongValue()
      return makeIRawGameController2(Pointer(address))
    }

    public override fun toNative(obj: IRawGameController2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__234979567_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRawGameController2): Array<IRawGameController2?> =
        (elements as
        Array<IRawGameController2?>).castToImpl<IRawGameController2,IRawGameController2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRawGameController2?> =
        arrayOfNulls<IRawGameController2_Impl>(size) as Array<IRawGameController2?>
  }
}
