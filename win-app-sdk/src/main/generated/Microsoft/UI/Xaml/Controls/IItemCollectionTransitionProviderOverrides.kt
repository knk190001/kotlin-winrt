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

@ABIMarker(IItemCollectionTransitionProviderOverrides.ABI::class)
@Signature("{6935222b-ef83-5872-a9d4-8319bcd67a67}")
@Guid("6935222bef835872a9d48319bcd67a67")
@WinRTInterface("6935222bef835872a9d48319bcd67a67")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemCollectionTransitionProviderOverrides.ByReference::class)
public interface IItemCollectionTransitionProviderOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ShouldAnimateCore(transition: ItemCollectionTransition?): Boolean

  @InterfaceMethod(1)
  public fun StartTransitions(transitions: IVector<ItemCollectionTransition?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemCollectionTransitionProviderOverrides> {
    public override fun getValue() =
        ABI.makeIItemCollectionTransitionProviderOverrides(pointer.getPointer(0))

    public fun setValue(value: IItemCollectionTransitionProviderOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemCollectionTransitionProviderOverrides {
    public val __1622681687_Ptr: Pointer?

    public val _1622681687_VtblPtr: Pointer?
      get() = __1622681687_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShouldAnimateCore(transition: ItemCollectionTransition?): Boolean {
      val fnPtr = _1622681687_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1622681687_Ptr, marshalToNative(transition), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun StartTransitions(transitions: IVector<ItemCollectionTransition?>?): Unit {
      val fnPtr = _1622681687_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1622681687_Ptr, marshalToNative(transitions),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IItemCollectionTransitionProviderOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1622681687_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemCollectionTransitionProviderOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6935222bef835872a9d48319bcd67a67")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemCollectionTransitionProviderOverrides(ptr: Pointer?): WithDefault =
        IItemCollectionTransitionProviderOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IItemCollectionTransitionProviderOverrides {
      val address = segment.toRawLongValue()
      return makeIItemCollectionTransitionProviderOverrides(Pointer(address))
    }

    public override fun toNative(obj: IItemCollectionTransitionProviderOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1622681687_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemCollectionTransitionProviderOverrides):
        Array<IItemCollectionTransitionProviderOverrides?> = (elements as
        Array<IItemCollectionTransitionProviderOverrides?>).castToImpl<IItemCollectionTransitionProviderOverrides,IItemCollectionTransitionProviderOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemCollectionTransitionProviderOverrides?> =
        arrayOfNulls<IItemCollectionTransitionProviderOverrides_Impl>(size) as
        Array<IItemCollectionTransitionProviderOverrides?>
  }
}
