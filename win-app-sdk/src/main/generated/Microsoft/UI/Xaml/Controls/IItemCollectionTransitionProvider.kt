package Microsoft.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IItemCollectionTransitionProvider.ABI::class)
@Signature("{32132262-e07d-51f7-a688-9528042f7e0b}")
@Guid("32132262e07d51f7a6889528042f7e0b")
@WinRTInterface("32132262e07d51f7a6889528042f7e0b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemCollectionTransitionProvider.ByReference::class)
public interface IItemCollectionTransitionProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ShouldAnimate(transition: ItemCollectionTransition?): Boolean

  @InterfaceMethod(1)
  public fun QueueTransition(transition: ItemCollectionTransition?): Unit

  @InterfaceMethod(2)
  public fun add_TransitionCompleted(handler: TypedEventHandler<ItemCollectionTransitionProvider?,
      ItemCollectionTransitionCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_TransitionCompleted(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemCollectionTransitionProvider> {
    public override fun getValue() =
        ABI.makeIItemCollectionTransitionProvider(pointer.getPointer(0))

    public fun setValue(value: IItemCollectionTransitionProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemCollectionTransitionProvider {
    public val __995551262_Ptr: Pointer?

    public val _995551262_VtblPtr: Pointer?
      get() = __995551262_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShouldAnimate(transition: ItemCollectionTransition?): Boolean {
      val fnPtr = _995551262_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__995551262_Ptr, marshalToNative(transition), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun QueueTransition(transition: ItemCollectionTransition?): Unit {
      val fnPtr = _995551262_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__995551262_Ptr, marshalToNative(transition),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override
        fun add_TransitionCompleted(handler: TypedEventHandler<ItemCollectionTransitionProvider?,
        ItemCollectionTransitionCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _995551262_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__995551262_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_TransitionCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _995551262_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__995551262_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IItemCollectionTransitionProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __995551262_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemCollectionTransitionProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("32132262e07d51f7a6889528042f7e0b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemCollectionTransitionProvider(ptr: Pointer?): WithDefault =
        IItemCollectionTransitionProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemCollectionTransitionProvider {
      val address = segment.toRawLongValue()
      return makeIItemCollectionTransitionProvider(Pointer(address))
    }

    public override fun toNative(obj: IItemCollectionTransitionProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__995551262_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemCollectionTransitionProvider):
        Array<IItemCollectionTransitionProvider?> = (elements as
        Array<IItemCollectionTransitionProvider?>).castToImpl<IItemCollectionTransitionProvider,IItemCollectionTransitionProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemCollectionTransitionProvider?> =
        arrayOfNulls<IItemCollectionTransitionProvider_Impl>(size) as
        Array<IItemCollectionTransitionProvider?>
  }
}
