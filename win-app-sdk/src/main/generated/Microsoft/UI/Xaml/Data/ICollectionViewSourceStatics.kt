package Microsoft.UI.Xaml.Data

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(ICollectionViewSourceStatics.ABI::class)
@Signature("{e282f10f-d4b1-5769-8a11-30f739e6113b}")
@Guid("e282f10fd4b157698a1130f739e6113b")
@WinRTInterface("e282f10fd4b157698a1130f739e6113b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICollectionViewSourceStatics.ByReference::class)
public interface ICollectionViewSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SourceProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ViewProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_IsSourceGroupedProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_ItemsPathProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICollectionViewSourceStatics> {
    public override fun getValue() = ABI.makeICollectionViewSourceStatics(pointer.getPointer(0))

    public fun setValue(value: ICollectionViewSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICollectionViewSourceStatics {
    public val __1418341460_Ptr: Pointer?

    public val _1418341460_VtblPtr: Pointer?
      get() = __1418341460_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SourceProperty(): DependencyProperty? {
      val fnPtr = _1418341460_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1418341460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ViewProperty(): DependencyProperty? {
      val fnPtr = _1418341460_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1418341460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsSourceGroupedProperty(): DependencyProperty? {
      val fnPtr = _1418341460_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1418341460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ItemsPathProperty(): DependencyProperty? {
      val fnPtr = _1418341460_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1418341460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ICollectionViewSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1418341460_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICollectionViewSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e282f10fd4b157698a1130f739e6113b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICollectionViewSourceStatics(ptr: Pointer?): WithDefault =
        ICollectionViewSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICollectionViewSourceStatics {
      val address = segment.toRawLongValue()
      return makeICollectionViewSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: ICollectionViewSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1418341460_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICollectionViewSourceStatics):
        Array<ICollectionViewSourceStatics?> = (elements as
        Array<ICollectionViewSourceStatics?>).castToImpl<ICollectionViewSourceStatics,ICollectionViewSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICollectionViewSourceStatics?> =
        arrayOfNulls<ICollectionViewSourceStatics_Impl>(size) as
        Array<ICollectionViewSourceStatics?>
  }
}
