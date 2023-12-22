package Windows.UI.Xaml.Data

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

@ABIMarker(ICollectionViewFactory.ABI::class)
@Signature("{34d4aaf4-8e72-4950-9192-ecd07d399d0a}")
@Guid("34d4aaf48e7249509192ecd07d399d0a")
@WinRTInterface("34d4aaf48e7249509192ecd07d399d0a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICollectionViewFactory.ByReference::class)
public interface ICollectionViewFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateView(): ICollectionView?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICollectionViewFactory> {
    public override fun getValue() = ABI.makeICollectionViewFactory(pointer.getPointer(0))

    public fun setValue(value: ICollectionViewFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICollectionViewFactory {
    public val __1334288385_Ptr: Pointer?

    public val _1334288385_VtblPtr: Pointer?
      get() = __1334288385_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateView(): ICollectionView? {
      val fnPtr = _1334288385_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ICollectionView>()
      val hr = fn.invokeHR(arrayOf(__1334288385_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ICollectionView>(result.getValue())
      return resultValue
    }
  }

  public class ICollectionViewFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1334288385_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICollectionViewFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("34d4aaf48e7249509192ecd07d399d0a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICollectionViewFactory(ptr: Pointer?): WithDefault =
        ICollectionViewFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICollectionViewFactory {
      val address = segment.toRawLongValue()
      return makeICollectionViewFactory(Pointer(address))
    }

    public override fun toNative(obj: ICollectionViewFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1334288385_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICollectionViewFactory): Array<ICollectionViewFactory?> =
        (elements as
        Array<ICollectionViewFactory?>).castToImpl<ICollectionViewFactory,ICollectionViewFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICollectionViewFactory?> =
        arrayOfNulls<ICollectionViewFactory_Impl>(size) as Array<ICollectionViewFactory?>
  }
}
