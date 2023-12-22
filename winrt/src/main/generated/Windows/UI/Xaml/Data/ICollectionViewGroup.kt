package Windows.UI.Xaml.Data

import Windows.Foundation.Collections.IObservableVector
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

@ABIMarker(ICollectionViewGroup.ABI::class)
@Signature("{7e01b9d8-d7b5-48b6-b31c-5bb5bdf5f09b}")
@Guid("7e01b9d8d7b548b6b31c5bb5bdf5f09b")
@WinRTInterface("7e01b9d8d7b548b6b31c5bb5bdf5f09b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICollectionViewGroup.ByReference::class)
public interface ICollectionViewGroup : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Group(): IUnknown?

  @InterfaceMethod(1)
  public fun get_GroupItems(): IObservableVector<IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICollectionViewGroup> {
    public override fun getValue() = ABI.makeICollectionViewGroup(pointer.getPointer(0))

    public fun setValue(value: ICollectionViewGroup_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICollectionViewGroup {
    public val __1063739060_Ptr: Pointer?

    public val _1063739060_VtblPtr: Pointer?
      get() = __1063739060_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Group(): IUnknown? {
      val fnPtr = _1063739060_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1063739060_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_GroupItems(): IObservableVector<IUnknown?>? {
      val fnPtr = _1063739060_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IObservableVector<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1063739060_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IObservableVector<IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class ICollectionViewGroup_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1063739060_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICollectionViewGroup, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7e01b9d8d7b548b6b31c5bb5bdf5f09b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICollectionViewGroup(ptr: Pointer?): WithDefault = ICollectionViewGroup_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICollectionViewGroup {
      val address = segment.toRawLongValue()
      return makeICollectionViewGroup(Pointer(address))
    }

    public override fun toNative(obj: ICollectionViewGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1063739060_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICollectionViewGroup): Array<ICollectionViewGroup?> =
        (elements as
        Array<ICollectionViewGroup?>).castToImpl<ICollectionViewGroup,ICollectionViewGroup_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICollectionViewGroup?> =
        arrayOfNulls<ICollectionViewGroup_Impl>(size) as Array<ICollectionViewGroup?>
  }
}
