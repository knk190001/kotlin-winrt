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

@ABIMarker(IFlipViewStatics.ABI::class)
@Signature("{1e98fc86-2bc1-5c89-8305-251ad56a9cdb}")
@Guid("1e98fc862bc15c898305251ad56a9cdb")
@WinRTInterface("1e98fc862bc15c898305251ad56a9cdb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlipViewStatics.ByReference::class)
public interface IFlipViewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UseTouchAnimationsForAllNavigationProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlipViewStatics> {
    public override fun getValue() = ABI.makeIFlipViewStatics(pointer.getPointer(0))

    public fun setValue(value: IFlipViewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlipViewStatics {
    public val __216062452_Ptr: Pointer?

    public val _216062452_VtblPtr: Pointer?
      get() = __216062452_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UseTouchAnimationsForAllNavigationProperty(): DependencyProperty? {
      val fnPtr = _216062452_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__216062452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IFlipViewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __216062452_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlipViewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1e98fc862bc15c898305251ad56a9cdb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlipViewStatics(ptr: Pointer?): WithDefault = IFlipViewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlipViewStatics {
      val address = segment.toRawLongValue()
      return makeIFlipViewStatics(Pointer(address))
    }

    public override fun toNative(obj: IFlipViewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__216062452_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlipViewStatics): Array<IFlipViewStatics?> = (elements as
        Array<IFlipViewStatics?>).castToImpl<IFlipViewStatics,IFlipViewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlipViewStatics?> =
        arrayOfNulls<IFlipViewStatics_Impl>(size) as Array<IFlipViewStatics?>
  }
}
