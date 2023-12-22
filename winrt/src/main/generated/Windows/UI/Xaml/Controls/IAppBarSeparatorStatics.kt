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

@ABIMarker(IAppBarSeparatorStatics.ABI::class)
@Signature("{37f23484-5b35-4663-a75d-f2d50cb9c619}")
@Guid("37f234845b354663a75df2d50cb9c619")
@WinRTInterface("37f234845b354663a75df2d50cb9c619")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarSeparatorStatics.ByReference::class)
public interface IAppBarSeparatorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsCompactProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarSeparatorStatics> {
    public override fun getValue() = ABI.makeIAppBarSeparatorStatics(pointer.getPointer(0))

    public fun setValue(value: IAppBarSeparatorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarSeparatorStatics {
    public val __476488334_Ptr: Pointer?

    public val _476488334_VtblPtr: Pointer?
      get() = __476488334_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsCompactProperty(): DependencyProperty? {
      val fnPtr = _476488334_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__476488334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAppBarSeparatorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __476488334_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarSeparatorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("37f234845b354663a75df2d50cb9c619")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarSeparatorStatics(ptr: Pointer?): WithDefault =
        IAppBarSeparatorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarSeparatorStatics {
      val address = segment.toRawLongValue()
      return makeIAppBarSeparatorStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppBarSeparatorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__476488334_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarSeparatorStatics): Array<IAppBarSeparatorStatics?>
        = (elements as
        Array<IAppBarSeparatorStatics?>).castToImpl<IAppBarSeparatorStatics,IAppBarSeparatorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarSeparatorStatics?> =
        arrayOfNulls<IAppBarSeparatorStatics_Impl>(size) as Array<IAppBarSeparatorStatics?>
  }
}
