package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyObject
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

@ABIMarker(IItemContainerMapping.ABI::class)
@Signature("{b3e03a32-ea83-5626-bfda-d327a1c7550c}")
@Guid("b3e03a32ea835626bfdad327a1c7550c")
@WinRTInterface("b3e03a32ea835626bfdad327a1c7550c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemContainerMapping.ByReference::class)
public interface IItemContainerMapping : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ItemFromContainer(container: DependencyObject?): IUnknown?

  @InterfaceMethod(1)
  public fun ContainerFromItem(item: IUnknown?): DependencyObject?

  @InterfaceMethod(2)
  public fun IndexFromContainer(container: DependencyObject?): Int

  @InterfaceMethod(3)
  public fun ContainerFromIndex(index: Int): DependencyObject?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemContainerMapping> {
    public override fun getValue() = ABI.makeIItemContainerMapping(pointer.getPointer(0))

    public fun setValue(value: IItemContainerMapping_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemContainerMapping {
    public val __2010046087_Ptr: Pointer?

    public val _2010046087_VtblPtr: Pointer?
      get() = __2010046087_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ItemFromContainer(container: DependencyObject?): IUnknown? {
      val fnPtr = _2010046087_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__2010046087_Ptr, marshalToNative(container), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ContainerFromItem(item: IUnknown?): DependencyObject? {
      val fnPtr = _2010046087_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__2010046087_Ptr, marshalToNative(item), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun IndexFromContainer(container: DependencyObject?): Int {
      val fnPtr = _2010046087_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2010046087_Ptr, marshalToNative(container), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun ContainerFromIndex(index: Int): DependencyObject? {
      val fnPtr = _2010046087_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__2010046087_Ptr, index, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }
  }

  public class IItemContainerMapping_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2010046087_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemContainerMapping, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b3e03a32ea835626bfdad327a1c7550c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemContainerMapping(ptr: Pointer?): WithDefault =
        IItemContainerMapping_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemContainerMapping {
      val address = segment.toRawLongValue()
      return makeIItemContainerMapping(Pointer(address))
    }

    public override fun toNative(obj: IItemContainerMapping): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2010046087_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemContainerMapping): Array<IItemContainerMapping?> =
        (elements as
        Array<IItemContainerMapping?>).castToImpl<IItemContainerMapping,IItemContainerMapping_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemContainerMapping?> =
        arrayOfNulls<IItemContainerMapping_Impl>(size) as Array<IItemContainerMapping?>
  }
}
