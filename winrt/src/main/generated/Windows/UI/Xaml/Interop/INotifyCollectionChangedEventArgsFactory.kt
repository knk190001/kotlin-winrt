package Windows.UI.Xaml.Interop

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

@ABIMarker(INotifyCollectionChangedEventArgsFactory.ABI::class)
@Signature("{b30c3e3a-df8d-44a5-9a38-7ac0d08ce63d}")
@Guid("b30c3e3adf8d44a59a387ac0d08ce63d")
@WinRTInterface("b30c3e3adf8d44a59a387ac0d08ce63d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INotifyCollectionChangedEventArgsFactory.ByReference::class)
public interface INotifyCollectionChangedEventArgsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithAllParameters(
    action: NotifyCollectionChangedAction?,
    newItems: IBindableVector?,
    oldItems: IBindableVector?,
    newIndex: Int,
    oldIndex: Int,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): NotifyCollectionChangedEventArgs?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INotifyCollectionChangedEventArgsFactory> {
    public override fun getValue() =
        ABI.makeINotifyCollectionChangedEventArgsFactory(pointer.getPointer(0))

    public fun setValue(value: INotifyCollectionChangedEventArgsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INotifyCollectionChangedEventArgsFactory {
    public val __129849955_Ptr: Pointer?

    public val _129849955_VtblPtr: Pointer?
      get() = __129849955_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithAllParameters(
      action: NotifyCollectionChangedAction?,
      newItems: IBindableVector?,
      oldItems: IBindableVector?,
      newIndex: Int,
      oldIndex: Int,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): NotifyCollectionChangedEventArgs? {
      val fnPtr = _129849955_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NotifyCollectionChangedEventArgs>()
      val hr = fn.invokeHR(arrayOf(__129849955_Ptr, marshalToNative(action),
          marshalToNative(newItems), marshalToNative(oldItems), newIndex, oldIndex,
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NotifyCollectionChangedEventArgs>(result.getValue())
      return resultValue
    }
  }

  public class INotifyCollectionChangedEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __129849955_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INotifyCollectionChangedEventArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b30c3e3adf8d44a59a387ac0d08ce63d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINotifyCollectionChangedEventArgsFactory(ptr: Pointer?): WithDefault =
        INotifyCollectionChangedEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        INotifyCollectionChangedEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeINotifyCollectionChangedEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: INotifyCollectionChangedEventArgsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__129849955_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INotifyCollectionChangedEventArgsFactory):
        Array<INotifyCollectionChangedEventArgsFactory?> = (elements as
        Array<INotifyCollectionChangedEventArgsFactory?>).castToImpl<INotifyCollectionChangedEventArgsFactory,INotifyCollectionChangedEventArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INotifyCollectionChangedEventArgsFactory?> =
        arrayOfNulls<INotifyCollectionChangedEventArgsFactory_Impl>(size) as
        Array<INotifyCollectionChangedEventArgsFactory?>
  }
}
