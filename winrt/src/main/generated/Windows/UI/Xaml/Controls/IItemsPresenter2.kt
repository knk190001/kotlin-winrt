package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DataTemplate
import Windows.UI.Xaml.Media.Animation.TransitionCollection
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IItemsPresenter2.ABI::class)
@Signature("{5c04aa33-1df3-4731-a4c9-da818378d63d}")
@Guid("5c04aa331df34731a4c9da818378d63d")
@WinRTInterface("5c04aa331df34731a4c9da818378d63d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsPresenter2.ByReference::class)
public interface IItemsPresenter2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Footer(): IUnknown?

  @InterfaceMethod(1)
  public fun put_Footer(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun get_FooterTemplate(): DataTemplate?

  @InterfaceMethod(3)
  public fun put_FooterTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(4)
  public fun get_FooterTransitions(): TransitionCollection?

  @InterfaceMethod(5)
  public fun put_FooterTransitions(value: TransitionCollection?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsPresenter2> {
    public override fun getValue() = ABI.makeIItemsPresenter2(pointer.getPointer(0))

    public fun setValue(value: IItemsPresenter2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsPresenter2 {
    public val __5213902_Ptr: Pointer?

    public val _5213902_VtblPtr: Pointer?
      get() = __5213902_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Footer(): IUnknown? {
      val fnPtr = _5213902_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__5213902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Footer(value: IUnknown?): Unit {
      val fnPtr = _5213902_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__5213902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_FooterTemplate(): DataTemplate? {
      val fnPtr = _5213902_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__5213902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_FooterTemplate(value: DataTemplate?): Unit {
      val fnPtr = _5213902_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__5213902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_FooterTransitions(): TransitionCollection? {
      val fnPtr = _5213902_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TransitionCollection>()
      val hr = fn.invokeHR(arrayOf(__5213902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TransitionCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_FooterTransitions(value: TransitionCollection?): Unit {
      val fnPtr = _5213902_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__5213902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IItemsPresenter2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __5213902_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsPresenter2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c04aa331df34731a4c9da818378d63d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsPresenter2(ptr: Pointer?): WithDefault = IItemsPresenter2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsPresenter2 {
      val address = segment.toRawLongValue()
      return makeIItemsPresenter2(Pointer(address))
    }

    public override fun toNative(obj: IItemsPresenter2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__5213902_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsPresenter2): Array<IItemsPresenter2?> = (elements as
        Array<IItemsPresenter2?>).castToImpl<IItemsPresenter2,IItemsPresenter2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsPresenter2?> =
        arrayOfNulls<IItemsPresenter2_Impl>(size) as Array<IItemsPresenter2?>
  }
}
