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

@ABIMarker(IStackLayoutStatics.ABI::class)
@Signature("{5610aecf-fb2a-5726-ac3a-16479ba2ecad}")
@Guid("5610aecffb2a5726ac3a16479ba2ecad")
@WinRTInterface("5610aecffb2a5726ac3a16479ba2ecad")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStackLayoutStatics.ByReference::class)
public interface IStackLayoutStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OrientationProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_SpacingProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStackLayoutStatics> {
    public override fun getValue() = ABI.makeIStackLayoutStatics(pointer.getPointer(0))

    public fun setValue(value: IStackLayoutStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStackLayoutStatics {
    public val __170782106_Ptr: Pointer?

    public val _170782106_VtblPtr: Pointer?
      get() = __170782106_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OrientationProperty(): DependencyProperty? {
      val fnPtr = _170782106_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__170782106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SpacingProperty(): DependencyProperty? {
      val fnPtr = _170782106_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__170782106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IStackLayoutStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __170782106_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStackLayoutStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5610aecffb2a5726ac3a16479ba2ecad")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStackLayoutStatics(ptr: Pointer?): WithDefault = IStackLayoutStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStackLayoutStatics {
      val address = segment.toRawLongValue()
      return makeIStackLayoutStatics(Pointer(address))
    }

    public override fun toNative(obj: IStackLayoutStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__170782106_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStackLayoutStatics): Array<IStackLayoutStatics?> =
        (elements as
        Array<IStackLayoutStatics?>).castToImpl<IStackLayoutStatics,IStackLayoutStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStackLayoutStatics?> =
        arrayOfNulls<IStackLayoutStatics_Impl>(size) as Array<IStackLayoutStatics?>
  }
}
