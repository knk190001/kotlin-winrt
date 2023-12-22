package Windows.UI.Xaml

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

@ABIMarker(IUIElementWeakCollectionFactory.ABI::class)
@Signature("{57242561-188a-5304-8792-a43f35d90f99}")
@Guid("57242561188a53048792a43f35d90f99")
@WinRTInterface("57242561188a53048792a43f35d90f99")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElementWeakCollectionFactory.ByReference::class)
public interface IUIElementWeakCollectionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      UIElementWeakCollection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUIElementWeakCollectionFactory> {
    public override fun getValue() = ABI.makeIUIElementWeakCollectionFactory(pointer.getPointer(0))

    public fun setValue(value: IUIElementWeakCollectionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElementWeakCollectionFactory {
    public val __271038018_Ptr: Pointer?

    public val _271038018_VtblPtr: Pointer?
      get() = __271038018_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        UIElementWeakCollection? {
      val fnPtr = _271038018_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElementWeakCollection>()
      val hr = fn.invokeHR(arrayOf(__271038018_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElementWeakCollection>(result.getValue())
      return resultValue
    }
  }

  public class IUIElementWeakCollectionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __271038018_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElementWeakCollectionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("57242561188a53048792a43f35d90f99")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElementWeakCollectionFactory(ptr: Pointer?): WithDefault =
        IUIElementWeakCollectionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElementWeakCollectionFactory {
      val address = segment.toRawLongValue()
      return makeIUIElementWeakCollectionFactory(Pointer(address))
    }

    public override fun toNative(obj: IUIElementWeakCollectionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__271038018_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElementWeakCollectionFactory):
        Array<IUIElementWeakCollectionFactory?> = (elements as
        Array<IUIElementWeakCollectionFactory?>).castToImpl<IUIElementWeakCollectionFactory,IUIElementWeakCollectionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElementWeakCollectionFactory?> =
        arrayOfNulls<IUIElementWeakCollectionFactory_Impl>(size) as
        Array<IUIElementWeakCollectionFactory?>
  }
}
