package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IRatingItemImageInfoStatics.ABI::class)
@Signature("{f582921d-0431-5e52-96d9-284d82dc7cba}")
@Guid("f582921d04315e5296d9284d82dc7cba")
@WinRTInterface("f582921d04315e5296d9284d82dc7cba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRatingItemImageInfoStatics.ByReference::class)
public interface IRatingItemImageInfoStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisabledImageProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ImageProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_PlaceholderImageProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_PointerOverImageProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_PointerOverPlaceholderImageProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_UnsetImageProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRatingItemImageInfoStatics> {
    public override fun getValue() = ABI.makeIRatingItemImageInfoStatics(pointer.getPointer(0))

    public fun setValue(value: IRatingItemImageInfoStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRatingItemImageInfoStatics {
    public val __1493164973_Ptr: Pointer?

    public val _1493164973_VtblPtr: Pointer?
      get() = __1493164973_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisabledImageProperty(): DependencyProperty? {
      val fnPtr = _1493164973_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1493164973_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ImageProperty(): DependencyProperty? {
      val fnPtr = _1493164973_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1493164973_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PlaceholderImageProperty(): DependencyProperty? {
      val fnPtr = _1493164973_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1493164973_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PointerOverImageProperty(): DependencyProperty? {
      val fnPtr = _1493164973_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1493164973_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_PointerOverPlaceholderImageProperty(): DependencyProperty? {
      val fnPtr = _1493164973_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1493164973_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_UnsetImageProperty(): DependencyProperty? {
      val fnPtr = _1493164973_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1493164973_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRatingItemImageInfoStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1493164973_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRatingItemImageInfoStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f582921d04315e5296d9284d82dc7cba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRatingItemImageInfoStatics(ptr: Pointer?): WithDefault =
        IRatingItemImageInfoStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRatingItemImageInfoStatics {
      val address = segment.toRawLongValue()
      return makeIRatingItemImageInfoStatics(Pointer(address))
    }

    public override fun toNative(obj: IRatingItemImageInfoStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1493164973_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRatingItemImageInfoStatics):
        Array<IRatingItemImageInfoStatics?> = (elements as
        Array<IRatingItemImageInfoStatics?>).castToImpl<IRatingItemImageInfoStatics,IRatingItemImageInfoStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRatingItemImageInfoStatics?> =
        arrayOfNulls<IRatingItemImageInfoStatics_Impl>(size) as Array<IRatingItemImageInfoStatics?>
  }
}
