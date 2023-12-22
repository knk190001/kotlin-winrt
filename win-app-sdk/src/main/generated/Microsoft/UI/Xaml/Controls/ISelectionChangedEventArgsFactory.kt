package Microsoft.UI.Xaml.Controls

import Windows.Foundation.Collections.IVector
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

@ABIMarker(ISelectionChangedEventArgsFactory.ABI::class)
@Signature("{0fcd041d-465f-5745-9882-0c8348e4135d}")
@Guid("0fcd041d465f574598820c8348e4135d")
@WinRTInterface("0fcd041d465f574598820c8348e4135d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISelectionChangedEventArgsFactory.ByReference::class)
public interface ISelectionChangedEventArgsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithRemovedItemsAndAddedItems(
    removedItems: IVector<IUnknown?>?,
    addedItems: IVector<IUnknown?>?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): SelectionChangedEventArgs?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISelectionChangedEventArgsFactory> {
    public override fun getValue() =
        ABI.makeISelectionChangedEventArgsFactory(pointer.getPointer(0))

    public fun setValue(value: ISelectionChangedEventArgsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISelectionChangedEventArgsFactory {
    public val __849920030_Ptr: Pointer?

    public val _849920030_VtblPtr: Pointer?
      get() = __849920030_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithRemovedItemsAndAddedItems(
      removedItems: IVector<IUnknown?>?,
      addedItems: IVector<IUnknown?>?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): SelectionChangedEventArgs? {
      val fnPtr = _849920030_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SelectionChangedEventArgs>()
      val hr = fn.invokeHR(arrayOf(__849920030_Ptr, marshalToNative(removedItems),
          marshalToNative(addedItems), marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SelectionChangedEventArgs>(result.getValue())
      return resultValue
    }
  }

  public class ISelectionChangedEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __849920030_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISelectionChangedEventArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0fcd041d465f574598820c8348e4135d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISelectionChangedEventArgsFactory(ptr: Pointer?): WithDefault =
        ISelectionChangedEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISelectionChangedEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeISelectionChangedEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: ISelectionChangedEventArgsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__849920030_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISelectionChangedEventArgsFactory):
        Array<ISelectionChangedEventArgsFactory?> = (elements as
        Array<ISelectionChangedEventArgsFactory?>).castToImpl<ISelectionChangedEventArgsFactory,ISelectionChangedEventArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISelectionChangedEventArgsFactory?> =
        arrayOfNulls<ISelectionChangedEventArgsFactory_Impl>(size) as
        Array<ISelectionChangedEventArgsFactory?>
  }
}
