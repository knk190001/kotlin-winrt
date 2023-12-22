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

@ABIMarker(IBitmapIconSourceStatics.ABI::class)
@Signature("{f4ba77bd-e13f-583b-b9f6-862e73753517}")
@Guid("f4ba77bde13f583bb9f6862e73753517")
@WinRTInterface("f4ba77bde13f583bb9f6862e73753517")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapIconSourceStatics.ByReference::class)
public interface IBitmapIconSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UriSourceProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ShowAsMonochromeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBitmapIconSourceStatics> {
    public override fun getValue() = ABI.makeIBitmapIconSourceStatics(pointer.getPointer(0))

    public fun setValue(value: IBitmapIconSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapIconSourceStatics {
    public val __1486995429_Ptr: Pointer?

    public val _1486995429_VtblPtr: Pointer?
      get() = __1486995429_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UriSourceProperty(): DependencyProperty? {
      val fnPtr = _1486995429_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1486995429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ShowAsMonochromeProperty(): DependencyProperty? {
      val fnPtr = _1486995429_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1486995429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IBitmapIconSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1486995429_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapIconSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f4ba77bde13f583bb9f6862e73753517")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapIconSourceStatics(ptr: Pointer?): WithDefault =
        IBitmapIconSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapIconSourceStatics {
      val address = segment.toRawLongValue()
      return makeIBitmapIconSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: IBitmapIconSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1486995429_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapIconSourceStatics):
        Array<IBitmapIconSourceStatics?> = (elements as
        Array<IBitmapIconSourceStatics?>).castToImpl<IBitmapIconSourceStatics,IBitmapIconSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapIconSourceStatics?> =
        arrayOfNulls<IBitmapIconSourceStatics_Impl>(size) as Array<IBitmapIconSourceStatics?>
  }
}
