package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IPathIconSourceStatics.ABI::class)
@Signature("{df7027d5-3682-43ff-80f0-afa256b2fdc3}")
@Guid("df7027d5368243ff80f0afa256b2fdc3")
@WinRTInterface("df7027d5368243ff80f0afa256b2fdc3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPathIconSourceStatics.ByReference::class)
public interface IPathIconSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DataProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPathIconSourceStatics> {
    public override fun getValue() = ABI.makeIPathIconSourceStatics(pointer.getPointer(0))

    public fun setValue(value: IPathIconSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPathIconSourceStatics {
    public val __639648496_Ptr: Pointer?

    public val _639648496_VtblPtr: Pointer?
      get() = __639648496_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DataProperty(): DependencyProperty? {
      val fnPtr = _639648496_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__639648496_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPathIconSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __639648496_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPathIconSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("df7027d5368243ff80f0afa256b2fdc3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPathIconSourceStatics(ptr: Pointer?): WithDefault =
        IPathIconSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPathIconSourceStatics {
      val address = segment.toRawLongValue()
      return makeIPathIconSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: IPathIconSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__639648496_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPathIconSourceStatics): Array<IPathIconSourceStatics?> =
        (elements as
        Array<IPathIconSourceStatics?>).castToImpl<IPathIconSourceStatics,IPathIconSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPathIconSourceStatics?> =
        arrayOfNulls<IPathIconSourceStatics_Impl>(size) as Array<IPathIconSourceStatics?>
  }
}
