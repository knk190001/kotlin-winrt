package Windows.UI.Xaml.Interop

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

@ABIMarker(INotifyCollectionChangedEventArgs.ABI::class)
@Signature("{4cf68d33-e3f2-4964-b85e-945b4f7e2f21}")
@Guid("4cf68d33e3f24964b85e945b4f7e2f21")
@WinRTInterface("4cf68d33e3f24964b85e945b4f7e2f21")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INotifyCollectionChangedEventArgs.ByReference::class)
public interface INotifyCollectionChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Action(): NotifyCollectionChangedAction?

  @InterfaceMethod(1)
  public fun get_NewItems(): IBindableVector?

  @InterfaceMethod(2)
  public fun get_OldItems(): IBindableVector?

  @InterfaceMethod(3)
  public fun get_NewStartingIndex(): Int

  @InterfaceMethod(4)
  public fun get_OldStartingIndex(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INotifyCollectionChangedEventArgs> {
    public override fun getValue() =
        ABI.makeINotifyCollectionChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: INotifyCollectionChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INotifyCollectionChangedEventArgs {
    public val __1469298349_Ptr: Pointer?

    public val _1469298349_VtblPtr: Pointer?
      get() = __1469298349_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Action(): NotifyCollectionChangedAction? {
      val fnPtr = _1469298349_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NotifyCollectionChangedAction>()
      val hr = fn.invokeHR(arrayOf(__1469298349_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NotifyCollectionChangedAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NewItems(): IBindableVector? {
      val fnPtr = _1469298349_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBindableVector>()
      val hr = fn.invokeHR(arrayOf(__1469298349_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBindableVector>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_OldItems(): IBindableVector? {
      val fnPtr = _1469298349_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBindableVector>()
      val hr = fn.invokeHR(arrayOf(__1469298349_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBindableVector>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_NewStartingIndex(): Int {
      val fnPtr = _1469298349_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1469298349_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_OldStartingIndex(): Int {
      val fnPtr = _1469298349_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1469298349_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class INotifyCollectionChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1469298349_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INotifyCollectionChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4cf68d33e3f24964b85e945b4f7e2f21")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINotifyCollectionChangedEventArgs(ptr: Pointer?): WithDefault =
        INotifyCollectionChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INotifyCollectionChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeINotifyCollectionChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: INotifyCollectionChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1469298349_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INotifyCollectionChangedEventArgs):
        Array<INotifyCollectionChangedEventArgs?> = (elements as
        Array<INotifyCollectionChangedEventArgs?>).castToImpl<INotifyCollectionChangedEventArgs,INotifyCollectionChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INotifyCollectionChangedEventArgs?> =
        arrayOfNulls<INotifyCollectionChangedEventArgs_Impl>(size) as
        Array<INotifyCollectionChangedEventArgs?>
  }
}
