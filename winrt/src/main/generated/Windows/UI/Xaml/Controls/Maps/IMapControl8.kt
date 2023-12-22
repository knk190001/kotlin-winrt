package Windows.UI.Xaml.Controls.Maps

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMapControl8.ABI::class)
@Signature("{009e9c46-724d-53ca-9421-7a48fc731523}")
@Guid("009e9c46724d53ca94217a48fc731523")
@WinRTInterface("009e9c46724d53ca94217a48fc731523")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControl8.ByReference::class)
public interface IMapControl8 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanTiltDown(): Boolean

  @InterfaceMethod(1)
  public fun get_CanTiltUp(): Boolean

  @InterfaceMethod(2)
  public fun get_CanZoomIn(): Boolean

  @InterfaceMethod(3)
  public fun get_CanZoomOut(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapControl8> {
    public override fun getValue() = ABI.makeIMapControl8(pointer.getPointer(0))

    public fun setValue(value: IMapControl8_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControl8 {
    public val __1767447046_Ptr: Pointer?

    public val _1767447046_VtblPtr: Pointer?
      get() = __1767447046_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanTiltDown(): Boolean {
      val fnPtr = _1767447046_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1767447046_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_CanTiltUp(): Boolean {
      val fnPtr = _1767447046_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1767447046_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_CanZoomIn(): Boolean {
      val fnPtr = _1767447046_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1767447046_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_CanZoomOut(): Boolean {
      val fnPtr = _1767447046_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1767447046_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IMapControl8_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1767447046_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControl8, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("009e9c46724d53ca94217a48fc731523")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControl8(ptr: Pointer?): WithDefault = IMapControl8_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapControl8 {
      val address = segment.toRawLongValue()
      return makeIMapControl8(Pointer(address))
    }

    public override fun toNative(obj: IMapControl8): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1767447046_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControl8): Array<IMapControl8?> = (elements as
        Array<IMapControl8?>).castToImpl<IMapControl8,IMapControl8_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapControl8?> =
        arrayOfNulls<IMapControl8_Impl>(size) as Array<IMapControl8?>
  }
}
