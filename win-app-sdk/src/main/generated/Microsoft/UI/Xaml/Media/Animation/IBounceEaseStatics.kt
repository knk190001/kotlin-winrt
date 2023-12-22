package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(IBounceEaseStatics.ABI::class)
@Signature("{d7716b38-c705-5093-96d6-735c13105a30}")
@Guid("d7716b38c705509396d6735c13105a30")
@WinRTInterface("d7716b38c705509396d6735c13105a30")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBounceEaseStatics.ByReference::class)
public interface IBounceEaseStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BouncesProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_BouncinessProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBounceEaseStatics> {
    public override fun getValue() = ABI.makeIBounceEaseStatics(pointer.getPointer(0))

    public fun setValue(value: IBounceEaseStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBounceEaseStatics {
    public val __1210482764_Ptr: Pointer?

    public val _1210482764_VtblPtr: Pointer?
      get() = __1210482764_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BouncesProperty(): DependencyProperty? {
      val fnPtr = _1210482764_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1210482764_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BouncinessProperty(): DependencyProperty? {
      val fnPtr = _1210482764_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1210482764_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IBounceEaseStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1210482764_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBounceEaseStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d7716b38c705509396d6735c13105a30")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBounceEaseStatics(ptr: Pointer?): WithDefault = IBounceEaseStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBounceEaseStatics {
      val address = segment.toRawLongValue()
      return makeIBounceEaseStatics(Pointer(address))
    }

    public override fun toNative(obj: IBounceEaseStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1210482764_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBounceEaseStatics): Array<IBounceEaseStatics?> =
        (elements as
        Array<IBounceEaseStatics?>).castToImpl<IBounceEaseStatics,IBounceEaseStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBounceEaseStatics?> =
        arrayOfNulls<IBounceEaseStatics_Impl>(size) as Array<IBounceEaseStatics?>
  }
}
