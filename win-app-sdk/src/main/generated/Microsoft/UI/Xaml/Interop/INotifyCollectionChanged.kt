package Microsoft.UI.Xaml.Interop

import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(INotifyCollectionChanged.ABI::class)
@Signature("{530155e1-28a5-5693-87ce-30724d95a06d}")
@Guid("530155e128a5569387ce30724d95a06d")
@WinRTInterface("530155e128a5569387ce30724d95a06d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INotifyCollectionChanged.ByReference::class)
public interface INotifyCollectionChanged : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_CollectionChanged(handler: NotifyCollectionChangedEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_CollectionChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INotifyCollectionChanged> {
    public override fun getValue() = ABI.makeINotifyCollectionChanged(pointer.getPointer(0))

    public fun setValue(value: INotifyCollectionChanged_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INotifyCollectionChanged {
    public val __1276419701_Ptr: Pointer?

    public val _1276419701_VtblPtr: Pointer?
      get() = __1276419701_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_CollectionChanged(handler: NotifyCollectionChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1276419701_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1276419701_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_CollectionChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1276419701_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1276419701_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INotifyCollectionChanged_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1276419701_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INotifyCollectionChanged, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("530155e128a5569387ce30724d95a06d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINotifyCollectionChanged(ptr: Pointer?): WithDefault =
        INotifyCollectionChanged_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INotifyCollectionChanged {
      val address = segment.toRawLongValue()
      return makeINotifyCollectionChanged(Pointer(address))
    }

    public override fun toNative(obj: INotifyCollectionChanged): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1276419701_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INotifyCollectionChanged):
        Array<INotifyCollectionChanged?> = (elements as
        Array<INotifyCollectionChanged?>).castToImpl<INotifyCollectionChanged,INotifyCollectionChanged_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INotifyCollectionChanged?> =
        arrayOfNulls<INotifyCollectionChanged_Impl>(size) as Array<INotifyCollectionChanged?>
  }
}
