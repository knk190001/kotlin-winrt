package Microsoft.UI.Xaml.Media

import Windows.Foundation.Rect
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

@ABIMarker(IGeometry.ABI::class)
@Signature("{dc102dcc-3be2-5414-8599-94b6e76ef39b}")
@Guid("dc102dcc3be25414859994b6e76ef39b")
@WinRTInterface("dc102dcc3be25414859994b6e76ef39b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeometry.ByReference::class)
public interface IGeometry : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Transform(): Transform?

  @InterfaceMethod(1)
  public fun put_Transform(value: Transform?): Unit

  @InterfaceMethod(2)
  public fun get_Bounds(): Rect?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGeometry> {
    public override fun getValue() = ABI.makeIGeometry(pointer.getPointer(0))

    public fun setValue(value: IGeometry_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeometry {
    public val __1988837283_Ptr: Pointer?

    public val _1988837283_VtblPtr: Pointer?
      get() = __1988837283_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Transform(): Transform? {
      val fnPtr = _1988837283_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Transform>()
      val hr = fn.invokeHR(arrayOf(__1988837283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Transform>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Transform(value: Transform?): Unit {
      val fnPtr = _1988837283_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1988837283_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Bounds(): Rect? {
      val fnPtr = _1988837283_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1988837283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }
  }

  public class IGeometry_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1988837283_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeometry, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dc102dcc3be25414859994b6e76ef39b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeometry(ptr: Pointer?): WithDefault = IGeometry_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeometry {
      val address = segment.toRawLongValue()
      return makeIGeometry(Pointer(address))
    }

    public override fun toNative(obj: IGeometry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1988837283_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeometry): Array<IGeometry?> = (elements as
        Array<IGeometry?>).castToImpl<IGeometry,IGeometry_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeometry?> = arrayOfNulls<IGeometry_Impl>(size)
        as Array<IGeometry?>
  }
}
