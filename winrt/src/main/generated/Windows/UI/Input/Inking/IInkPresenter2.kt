package Windows.UI.Input.Inking

import Windows.UI.Input.Inking.IInkPresenter.ABI.IID
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

@ABIMarker(IInkPresenter2.ABI::class)
@Signature("{cf53e612-9a34-11e6-9f33-a24fc0d9649c}")
@Guid("cf53e6129a3411e69f33a24fc0d9649c")
@WinRTInterface("cf53e6129a3411e69f33a24fc0d9649c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkPresenter2.ByReference::class)
public interface IInkPresenter2 : NativeMapped, IWinRTInterface, IInkPresenter {
  @InterfaceMethod(0)
  public fun get_HighContrastAdjustment(): InkHighContrastAdjustment?

  @InterfaceMethod(1)
  public fun put_HighContrastAdjustment(value: InkHighContrastAdjustment?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInkPresenter2>
      {
    public override fun getValue() = ABI.makeIInkPresenter2(pointer.getPointer(0))

    public fun setValue(value: IInkPresenter2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkPresenter2, IInkPresenter.WithDefault {
    public val __1195780170_Ptr: Pointer?

    public val _1195780170_VtblPtr: Pointer?
      get() = __1195780170_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HighContrastAdjustment(): InkHighContrastAdjustment? {
      val fnPtr = _1195780170_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkHighContrastAdjustment>()
      val hr = fn.invokeHR(arrayOf(__1195780170_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkHighContrastAdjustment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_HighContrastAdjustment(value: InkHighContrastAdjustment?): Unit {
      val fnPtr = _1195780170_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1195780170_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkPresenter2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IInkPresenter {
    public override val __592762884_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1195780170_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1195780170_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkPresenter2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cf53e6129a3411e69f33a24fc0d9649c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkPresenter2(ptr: Pointer?): WithDefault = IInkPresenter2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkPresenter2 {
      val address = segment.toRawLongValue()
      return makeIInkPresenter2(Pointer(address))
    }

    public override fun toNative(obj: IInkPresenter2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1195780170_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkPresenter2): Array<IInkPresenter2?> = (elements as
        Array<IInkPresenter2?>).castToImpl<IInkPresenter2,IInkPresenter2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkPresenter2?> =
        arrayOfNulls<IInkPresenter2_Impl>(size) as Array<IInkPresenter2?>
  }
}
