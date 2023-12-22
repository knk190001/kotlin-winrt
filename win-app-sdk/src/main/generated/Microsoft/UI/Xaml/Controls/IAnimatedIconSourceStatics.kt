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

@ABIMarker(IAnimatedIconSourceStatics.ABI::class)
@Signature("{8e4919fc-e8aa-5428-9779-6fe7168afa1c}")
@Guid("8e4919fce8aa542897796fe7168afa1c")
@WinRTInterface("8e4919fce8aa542897796fe7168afa1c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnimatedIconSourceStatics.ByReference::class)
public interface IAnimatedIconSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SourceProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_FallbackIconSourceProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_MirroredWhenRightToLeftProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnimatedIconSourceStatics> {
    public override fun getValue() = ABI.makeIAnimatedIconSourceStatics(pointer.getPointer(0))

    public fun setValue(value: IAnimatedIconSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnimatedIconSourceStatics {
    public val __240077799_Ptr: Pointer?

    public val _240077799_VtblPtr: Pointer?
      get() = __240077799_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SourceProperty(): DependencyProperty? {
      val fnPtr = _240077799_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__240077799_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FallbackIconSourceProperty(): DependencyProperty? {
      val fnPtr = _240077799_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__240077799_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MirroredWhenRightToLeftProperty(): DependencyProperty? {
      val fnPtr = _240077799_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__240077799_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAnimatedIconSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __240077799_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnimatedIconSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8e4919fce8aa542897796fe7168afa1c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnimatedIconSourceStatics(ptr: Pointer?): WithDefault =
        IAnimatedIconSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnimatedIconSourceStatics {
      val address = segment.toRawLongValue()
      return makeIAnimatedIconSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: IAnimatedIconSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__240077799_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnimatedIconSourceStatics):
        Array<IAnimatedIconSourceStatics?> = (elements as
        Array<IAnimatedIconSourceStatics?>).castToImpl<IAnimatedIconSourceStatics,IAnimatedIconSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnimatedIconSourceStatics?> =
        arrayOfNulls<IAnimatedIconSourceStatics_Impl>(size) as Array<IAnimatedIconSourceStatics?>
  }
}
