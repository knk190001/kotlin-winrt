package Windows.UI.Xaml.Controls

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

@ABIMarker(IChoosingGroupHeaderContainerEventArgs.ABI::class)
@Signature("{67db44d6-d201-4d72-beac-5e8e58afd8c7}")
@Guid("67db44d6d2014d72beac5e8e58afd8c7")
@WinRTInterface("67db44d6d2014d72beac5e8e58afd8c7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChoosingGroupHeaderContainerEventArgs.ByReference::class)
public interface IChoosingGroupHeaderContainerEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_GroupHeaderContainer(): ListViewBaseHeaderItem?

  @InterfaceMethod(1)
  public fun put_GroupHeaderContainer(value: ListViewBaseHeaderItem?): Unit

  @InterfaceMethod(2)
  public fun get_GroupIndex(): Int

  @InterfaceMethod(3)
  public fun get_Group(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChoosingGroupHeaderContainerEventArgs> {
    public override fun getValue() =
        ABI.makeIChoosingGroupHeaderContainerEventArgs(pointer.getPointer(0))

    public fun setValue(value: IChoosingGroupHeaderContainerEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChoosingGroupHeaderContainerEventArgs {
    public val __811583186_Ptr: Pointer?

    public val _811583186_VtblPtr: Pointer?
      get() = __811583186_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_GroupHeaderContainer(): ListViewBaseHeaderItem? {
      val fnPtr = _811583186_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListViewBaseHeaderItem>()
      val hr = fn.invokeHR(arrayOf(__811583186_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ListViewBaseHeaderItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_GroupHeaderContainer(value: ListViewBaseHeaderItem?): Unit {
      val fnPtr = _811583186_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__811583186_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_GroupIndex(): Int {
      val fnPtr = _811583186_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__811583186_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Group(): IUnknown? {
      val fnPtr = _811583186_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__811583186_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IChoosingGroupHeaderContainerEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __811583186_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChoosingGroupHeaderContainerEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("67db44d6d2014d72beac5e8e58afd8c7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChoosingGroupHeaderContainerEventArgs(ptr: Pointer?): WithDefault =
        IChoosingGroupHeaderContainerEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChoosingGroupHeaderContainerEventArgs {
      val address = segment.toRawLongValue()
      return makeIChoosingGroupHeaderContainerEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IChoosingGroupHeaderContainerEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__811583186_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChoosingGroupHeaderContainerEventArgs):
        Array<IChoosingGroupHeaderContainerEventArgs?> = (elements as
        Array<IChoosingGroupHeaderContainerEventArgs?>).castToImpl<IChoosingGroupHeaderContainerEventArgs,IChoosingGroupHeaderContainerEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChoosingGroupHeaderContainerEventArgs?> =
        arrayOfNulls<IChoosingGroupHeaderContainerEventArgs_Impl>(size) as
        Array<IChoosingGroupHeaderContainerEventArgs?>
  }
}
