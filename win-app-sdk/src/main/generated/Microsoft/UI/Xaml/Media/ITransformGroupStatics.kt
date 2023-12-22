package Microsoft.UI.Xaml.Media

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

@ABIMarker(ITransformGroupStatics.ABI::class)
@Signature("{8f1508f6-7dcf-53d5-bbc0-d8fcd96d7399}")
@Guid("8f1508f67dcf53d5bbc0d8fcd96d7399")
@WinRTInterface("8f1508f67dcf53d5bbc0d8fcd96d7399")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITransformGroupStatics.ByReference::class)
public interface ITransformGroupStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ChildrenProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITransformGroupStatics> {
    public override fun getValue() = ABI.makeITransformGroupStatics(pointer.getPointer(0))

    public fun setValue(value: ITransformGroupStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITransformGroupStatics {
    public val __20848063_Ptr: Pointer?

    public val _20848063_VtblPtr: Pointer?
      get() = __20848063_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChildrenProperty(): DependencyProperty? {
      val fnPtr = _20848063_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__20848063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITransformGroupStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __20848063_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITransformGroupStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8f1508f67dcf53d5bbc0d8fcd96d7399")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITransformGroupStatics(ptr: Pointer?): WithDefault =
        ITransformGroupStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITransformGroupStatics {
      val address = segment.toRawLongValue()
      return makeITransformGroupStatics(Pointer(address))
    }

    public override fun toNative(obj: ITransformGroupStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__20848063_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITransformGroupStatics): Array<ITransformGroupStatics?> =
        (elements as
        Array<ITransformGroupStatics?>).castToImpl<ITransformGroupStatics,ITransformGroupStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITransformGroupStatics?> =
        arrayOfNulls<ITransformGroupStatics_Impl>(size) as Array<ITransformGroupStatics?>
  }
}
