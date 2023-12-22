package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.UIElement
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

@ABIMarker(IItemCollectionTransitionProgress.ABI::class)
@Signature("{4da82dde-c778-57f6-a0e7-a767ef08591d}")
@Guid("4da82ddec77857f6a0e7a767ef08591d")
@WinRTInterface("4da82ddec77857f6a0e7a767ef08591d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemCollectionTransitionProgress.ByReference::class)
public interface IItemCollectionTransitionProgress : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Transition(): ItemCollectionTransition?

  @InterfaceMethod(1)
  public fun get_Element(): UIElement?

  @InterfaceMethod(2)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemCollectionTransitionProgress> {
    public override fun getValue() =
        ABI.makeIItemCollectionTransitionProgress(pointer.getPointer(0))

    public fun setValue(value: IItemCollectionTransitionProgress_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemCollectionTransitionProgress {
    public val __981967962_Ptr: Pointer?

    public val _981967962_VtblPtr: Pointer?
      get() = __981967962_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Transition(): ItemCollectionTransition? {
      val fnPtr = _981967962_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemCollectionTransition>()
      val hr = fn.invokeHR(arrayOf(__981967962_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemCollectionTransition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Element(): UIElement? {
      val fnPtr = _981967962_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__981967962_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun Complete(): Unit {
      val fnPtr = _981967962_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__981967962_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IItemCollectionTransitionProgress_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __981967962_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemCollectionTransitionProgress, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4da82ddec77857f6a0e7a767ef08591d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemCollectionTransitionProgress(ptr: Pointer?): WithDefault =
        IItemCollectionTransitionProgress_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemCollectionTransitionProgress {
      val address = segment.toRawLongValue()
      return makeIItemCollectionTransitionProgress(Pointer(address))
    }

    public override fun toNative(obj: IItemCollectionTransitionProgress): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__981967962_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemCollectionTransitionProgress):
        Array<IItemCollectionTransitionProgress?> = (elements as
        Array<IItemCollectionTransitionProgress?>).castToImpl<IItemCollectionTransitionProgress,IItemCollectionTransitionProgress_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemCollectionTransitionProgress?> =
        arrayOfNulls<IItemCollectionTransitionProgress_Impl>(size) as
        Array<IItemCollectionTransitionProgress?>
  }
}
