package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.GeneratorDirection
import Microsoft.UI.Xaml.Controls.Primitives.GeneratorPosition
import Microsoft.UI.Xaml.Controls.Primitives.ItemsChangedEventHandler
import Microsoft.UI.Xaml.DependencyObject
import Windows.Foundation.EventRegistrationToken
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IItemContainerGenerator.ABI::class)
@Signature("{c4c5d5ae-ed98-510f-afae-8a0ac6067a3b}")
@Guid("c4c5d5aeed98510fafae8a0ac6067a3b")
@WinRTInterface("c4c5d5aeed98510fafae8a0ac6067a3b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemContainerGenerator.ByReference::class)
public interface IItemContainerGenerator : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_ItemsChanged(handler: ItemsChangedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ItemsChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun ItemFromContainer(container: DependencyObject?): IUnknown?

  @InterfaceMethod(3)
  public fun ContainerFromItem(item: IUnknown?): DependencyObject?

  @InterfaceMethod(4)
  public fun IndexFromContainer(container: DependencyObject?): Int

  @InterfaceMethod(5)
  public fun ContainerFromIndex(index: Int): DependencyObject?

  @InterfaceMethod(6)
  public fun GetItemContainerGeneratorForPanel(panel: Panel?): ItemContainerGenerator?

  @InterfaceMethod(7)
  public fun StartAt(
    position: GeneratorPosition?,
    direction: GeneratorDirection?,
    allowStartAtRealizedItem: Boolean
  ): Unit

  @InterfaceMethod(8)
  public fun Stop(): Unit

  @InterfaceMethod(9)
  public fun GenerateNext(isNewlyRealized: Boolean): DependencyObject?

  @InterfaceMethod(10)
  public fun PrepareItemContainer(container: DependencyObject?): Unit

  @InterfaceMethod(11)
  public fun RemoveAll(): Unit

  @InterfaceMethod(12)
  public fun Remove(position: GeneratorPosition?, count: Int): Unit

  @InterfaceMethod(13)
  public fun GeneratorPositionFromIndex(itemIndex: Int): GeneratorPosition?

  @InterfaceMethod(14)
  public fun IndexFromGeneratorPosition(position: GeneratorPosition?): Int

  @InterfaceMethod(15)
  public fun Recycle(position: GeneratorPosition?, count: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemContainerGenerator> {
    public override fun getValue() = ABI.makeIItemContainerGenerator(pointer.getPointer(0))

    public fun setValue(value: IItemContainerGenerator_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemContainerGenerator {
    public val __1768085068_Ptr: Pointer?

    public val _1768085068_VtblPtr: Pointer?
      get() = __1768085068_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_ItemsChanged(handler: ItemsChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1768085068_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1768085068_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ItemsChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1768085068_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1768085068_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ItemFromContainer(container: DependencyObject?): IUnknown? {
      val fnPtr = _1768085068_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1768085068_Ptr, marshalToNative(container), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ContainerFromItem(item: IUnknown?): DependencyObject? {
      val fnPtr = _1768085068_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1768085068_Ptr, marshalToNative(item), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun IndexFromContainer(container: DependencyObject?): Int {
      val fnPtr = _1768085068_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1768085068_Ptr, marshalToNative(container), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun ContainerFromIndex(index: Int): DependencyObject? {
      val fnPtr = _1768085068_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1768085068_Ptr, index, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetItemContainerGeneratorForPanel(panel: Panel?): ItemContainerGenerator? {
      val fnPtr = _1768085068_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemContainerGenerator>()
      val hr = fn.invokeHR(arrayOf(__1768085068_Ptr, marshalToNative(panel), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemContainerGenerator>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun StartAt(
      position: GeneratorPosition?,
      direction: GeneratorDirection?,
      allowStartAtRealizedItem: Boolean
    ): Unit {
      val fnPtr = _1768085068_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1768085068_Ptr, marshalToNative(position),
          marshalToNative(direction), allowStartAtRealizedItem,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun Stop(): Unit {
      val fnPtr = _1768085068_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1768085068_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun GenerateNext(isNewlyRealized: Boolean): DependencyObject? {
      val fnPtr = _1768085068_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1768085068_Ptr, isNewlyRealized, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun PrepareItemContainer(container: DependencyObject?): Unit {
      val fnPtr = _1768085068_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1768085068_Ptr, marshalToNative(container),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun RemoveAll(): Unit {
      val fnPtr = _1768085068_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1768085068_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun Remove(position: GeneratorPosition?, count: Int): Unit {
      val fnPtr = _1768085068_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1768085068_Ptr, marshalToNative(position), count,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun GeneratorPositionFromIndex(itemIndex: Int): GeneratorPosition? {
      val fnPtr = _1768085068_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeneratorPosition>()
      val hr = fn.invokeHR(arrayOf(__1768085068_Ptr, itemIndex, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeneratorPosition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun IndexFromGeneratorPosition(position: GeneratorPosition?): Int {
      val fnPtr = _1768085068_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1768085068_Ptr, marshalToNative(position), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun Recycle(position: GeneratorPosition?, count: Int): Unit {
      val fnPtr = _1768085068_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1768085068_Ptr, marshalToNative(position), count,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IItemContainerGenerator_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1768085068_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemContainerGenerator, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c4c5d5aeed98510fafae8a0ac6067a3b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemContainerGenerator(ptr: Pointer?): WithDefault =
        IItemContainerGenerator_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemContainerGenerator {
      val address = segment.toRawLongValue()
      return makeIItemContainerGenerator(Pointer(address))
    }

    public override fun toNative(obj: IItemContainerGenerator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1768085068_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemContainerGenerator): Array<IItemContainerGenerator?>
        = (elements as
        Array<IItemContainerGenerator?>).castToImpl<IItemContainerGenerator,IItemContainerGenerator_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemContainerGenerator?> =
        arrayOfNulls<IItemContainerGenerator_Impl>(size) as Array<IItemContainerGenerator?>
  }
}
