package Microsoft.UI.Xaml.Controls

import Windows.Foundation.Rect
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

@ABIMarker(IItemCollectionTransition.ABI::class)
@Signature("{63a8d310-4d8a-515e-a900-0416d9374575}")
@Guid("63a8d3104d8a515ea9000416d9374575")
@WinRTInterface("63a8d3104d8a515ea9000416d9374575")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemCollectionTransition.ByReference::class)
public interface IItemCollectionTransition : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Operation(): ItemCollectionTransitionOperation?

  @InterfaceMethod(1)
  public fun get_Triggers(): ItemCollectionTransitionTriggers?

  @InterfaceMethod(2)
  public fun get_OldBounds(): Rect?

  @InterfaceMethod(3)
  public fun get_NewBounds(): Rect?

  @InterfaceMethod(4)
  public fun get_HasStarted(): Boolean

  @InterfaceMethod(5)
  public fun Start(): ItemCollectionTransitionProgress?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemCollectionTransition> {
    public override fun getValue() = ABI.makeIItemCollectionTransition(pointer.getPointer(0))

    public fun setValue(value: IItemCollectionTransition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemCollectionTransition {
    public val __1491720973_Ptr: Pointer?

    public val _1491720973_VtblPtr: Pointer?
      get() = __1491720973_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Operation(): ItemCollectionTransitionOperation? {
      val fnPtr = _1491720973_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemCollectionTransitionOperation>()
      val hr = fn.invokeHR(arrayOf(__1491720973_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemCollectionTransitionOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Triggers(): ItemCollectionTransitionTriggers? {
      val fnPtr = _1491720973_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemCollectionTransitionTriggers>()
      val hr = fn.invokeHR(arrayOf(__1491720973_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemCollectionTransitionTriggers>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_OldBounds(): Rect? {
      val fnPtr = _1491720973_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1491720973_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_NewBounds(): Rect? {
      val fnPtr = _1491720973_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1491720973_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_HasStarted(): Boolean {
      val fnPtr = _1491720973_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1491720973_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun Start(): ItemCollectionTransitionProgress? {
      val fnPtr = _1491720973_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemCollectionTransitionProgress>()
      val hr = fn.invokeHR(arrayOf(__1491720973_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemCollectionTransitionProgress>(result.getValue())
      return resultValue
    }
  }

  public class IItemCollectionTransition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1491720973_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemCollectionTransition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("63a8d3104d8a515ea9000416d9374575")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemCollectionTransition(ptr: Pointer?): WithDefault =
        IItemCollectionTransition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemCollectionTransition {
      val address = segment.toRawLongValue()
      return makeIItemCollectionTransition(Pointer(address))
    }

    public override fun toNative(obj: IItemCollectionTransition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1491720973_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemCollectionTransition):
        Array<IItemCollectionTransition?> = (elements as
        Array<IItemCollectionTransition?>).castToImpl<IItemCollectionTransition,IItemCollectionTransition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemCollectionTransition?> =
        arrayOfNulls<IItemCollectionTransition_Impl>(size) as Array<IItemCollectionTransition?>
  }
}
