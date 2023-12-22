package Windows.UI.Xaml

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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGridLengthHelperStatics.ABI::class)
@Signature("{9d457b9b-019f-4266-8872-215f198f6a9d}")
@Guid("9d457b9b019f42668872215f198f6a9d")
@WinRTInterface("9d457b9b019f42668872215f198f6a9d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridLengthHelperStatics.ByReference::class)
public interface IGridLengthHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Auto(): GridLength?

  @InterfaceMethod(1)
  public fun FromPixels(pixels: Double): GridLength?

  @InterfaceMethod(2)
  public fun FromValueAndType(value: Double, type: GridUnitType?): GridLength?

  @InterfaceMethod(3)
  public fun GetIsAbsolute(target: GridLength?): Boolean

  @InterfaceMethod(4)
  public fun GetIsAuto(target: GridLength?): Boolean

  @InterfaceMethod(5)
  public fun GetIsStar(target: GridLength?): Boolean

  @InterfaceMethod(6)
  public fun Equals(target: GridLength?, value: GridLength?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGridLengthHelperStatics> {
    public override fun getValue() = ABI.makeIGridLengthHelperStatics(pointer.getPointer(0))

    public fun setValue(value: IGridLengthHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridLengthHelperStatics {
    public val __1279673543_Ptr: Pointer?

    public val _1279673543_VtblPtr: Pointer?
      get() = __1279673543_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Auto(): GridLength? {
      val fnPtr = _1279673543_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GridLength>()
      val hr = fn.invokeHR(arrayOf(__1279673543_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GridLength>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromPixels(pixels: Double): GridLength? {
      val fnPtr = _1279673543_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GridLength>()
      val hr = fn.invokeHR(arrayOf(__1279673543_Ptr, pixels, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GridLength>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FromValueAndType(value: Double, type: GridUnitType?): GridLength? {
      val fnPtr = _1279673543_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GridLength>()
      val hr = fn.invokeHR(arrayOf(__1279673543_Ptr, value, marshalToNative(type), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GridLength>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetIsAbsolute(target: GridLength?): Boolean {
      val fnPtr = _1279673543_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1279673543_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun GetIsAuto(target: GridLength?): Boolean {
      val fnPtr = _1279673543_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1279673543_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun GetIsStar(target: GridLength?): Boolean {
      val fnPtr = _1279673543_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1279673543_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun Equals(target: GridLength?, value: GridLength?): Boolean {
      val fnPtr = _1279673543_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1279673543_Ptr, marshalToNative(target),
          marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IGridLengthHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1279673543_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridLengthHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9d457b9b019f42668872215f198f6a9d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridLengthHelperStatics(ptr: Pointer?): WithDefault =
        IGridLengthHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridLengthHelperStatics {
      val address = segment.toRawLongValue()
      return makeIGridLengthHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: IGridLengthHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1279673543_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridLengthHelperStatics):
        Array<IGridLengthHelperStatics?> = (elements as
        Array<IGridLengthHelperStatics?>).castToImpl<IGridLengthHelperStatics,IGridLengthHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridLengthHelperStatics?> =
        arrayOfNulls<IGridLengthHelperStatics_Impl>(size) as Array<IGridLengthHelperStatics?>
  }
}
