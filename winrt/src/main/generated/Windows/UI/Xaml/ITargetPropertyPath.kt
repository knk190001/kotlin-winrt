package Windows.UI.Xaml

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ITargetPropertyPath.ABI::class)
@Signature("{40740f8e-085f-4ced-be70-6f47acf15ad0}")
@Guid("40740f8e085f4cedbe706f47acf15ad0")
@WinRTInterface("40740f8e085f4cedbe706f47acf15ad0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITargetPropertyPath.ByReference::class)
public interface ITargetPropertyPath : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Path(): PropertyPath?

  @InterfaceMethod(1)
  public fun put_Path(value: PropertyPath?): Unit

  @InterfaceMethod(2)
  public fun get_Target(): IUnknown?

  @InterfaceMethod(3)
  public fun put_Target(value: IUnknown?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITargetPropertyPath> {
    public override fun getValue() = ABI.makeITargetPropertyPath(pointer.getPointer(0))

    public fun setValue(value: ITargetPropertyPath_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITargetPropertyPath {
    public val __1997582947_Ptr: Pointer?

    public val _1997582947_VtblPtr: Pointer?
      get() = __1997582947_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Path(): PropertyPath? {
      val fnPtr = _1997582947_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PropertyPath>()
      val hr = fn.invokeHR(arrayOf(__1997582947_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PropertyPath>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Path(value: PropertyPath?): Unit {
      val fnPtr = _1997582947_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1997582947_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Target(): IUnknown? {
      val fnPtr = _1997582947_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1997582947_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Target(value: IUnknown?): Unit {
      val fnPtr = _1997582947_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1997582947_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITargetPropertyPath_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1997582947_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITargetPropertyPath, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("40740f8e085f4cedbe706f47acf15ad0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITargetPropertyPath(ptr: Pointer?): WithDefault = ITargetPropertyPath_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITargetPropertyPath {
      val address = segment.toRawLongValue()
      return makeITargetPropertyPath(Pointer(address))
    }

    public override fun toNative(obj: ITargetPropertyPath): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1997582947_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITargetPropertyPath): Array<ITargetPropertyPath?> =
        (elements as
        Array<ITargetPropertyPath?>).castToImpl<ITargetPropertyPath,ITargetPropertyPath_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITargetPropertyPath?> =
        arrayOfNulls<ITargetPropertyPath_Impl>(size) as Array<ITargetPropertyPath?>
  }
}
