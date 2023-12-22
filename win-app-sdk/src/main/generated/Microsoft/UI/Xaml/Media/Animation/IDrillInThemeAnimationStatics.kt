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

@ABIMarker(IDrillInThemeAnimationStatics.ABI::class)
@Signature("{ba24258e-3a8e-5804-915a-7670893dbea4}")
@Guid("ba24258e3a8e5804915a7670893dbea4")
@WinRTInterface("ba24258e3a8e5804915a7670893dbea4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDrillInThemeAnimationStatics.ByReference::class)
public interface IDrillInThemeAnimationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EntranceTargetNameProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_EntranceTargetProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ExitTargetNameProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_ExitTargetProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDrillInThemeAnimationStatics> {
    public override fun getValue() = ABI.makeIDrillInThemeAnimationStatics(pointer.getPointer(0))

    public fun setValue(value: IDrillInThemeAnimationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDrillInThemeAnimationStatics {
    public val __4285445_Ptr: Pointer?

    public val _4285445_VtblPtr: Pointer?
      get() = __4285445_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EntranceTargetNameProperty(): DependencyProperty? {
      val fnPtr = _4285445_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__4285445_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EntranceTargetProperty(): DependencyProperty? {
      val fnPtr = _4285445_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__4285445_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ExitTargetNameProperty(): DependencyProperty? {
      val fnPtr = _4285445_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__4285445_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ExitTargetProperty(): DependencyProperty? {
      val fnPtr = _4285445_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__4285445_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IDrillInThemeAnimationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __4285445_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDrillInThemeAnimationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ba24258e3a8e5804915a7670893dbea4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDrillInThemeAnimationStatics(ptr: Pointer?): WithDefault =
        IDrillInThemeAnimationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDrillInThemeAnimationStatics {
      val address = segment.toRawLongValue()
      return makeIDrillInThemeAnimationStatics(Pointer(address))
    }

    public override fun toNative(obj: IDrillInThemeAnimationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__4285445_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDrillInThemeAnimationStatics):
        Array<IDrillInThemeAnimationStatics?> = (elements as
        Array<IDrillInThemeAnimationStatics?>).castToImpl<IDrillInThemeAnimationStatics,IDrillInThemeAnimationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDrillInThemeAnimationStatics?> =
        arrayOfNulls<IDrillInThemeAnimationStatics_Impl>(size) as
        Array<IDrillInThemeAnimationStatics?>
  }
}
