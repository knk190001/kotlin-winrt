package Windows.UI.Input

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

@ABIMarker(IRadialControllerConfiguration2.ABI::class)
@Signature("{3d577ef7-3cee-11e6-b535-001bdc06ab3b}")
@Guid("3d577ef73cee11e6b535001bdc06ab3b")
@WinRTInterface("3d577ef73cee11e6b535001bdc06ab3b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadialControllerConfiguration2.ByReference::class)
public interface IRadialControllerConfiguration2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_ActiveControllerWhenMenuIsSuppressed(value: RadialController?): Unit

  @InterfaceMethod(1)
  public fun get_ActiveControllerWhenMenuIsSuppressed(): RadialController?

  @InterfaceMethod(2)
  public fun put_IsMenuSuppressed(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_IsMenuSuppressed(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadialControllerConfiguration2> {
    public override fun getValue() = ABI.makeIRadialControllerConfiguration2(pointer.getPointer(0))

    public fun setValue(value: IRadialControllerConfiguration2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadialControllerConfiguration2 {
    public val __410348101_Ptr: Pointer?

    public val _410348101_VtblPtr: Pointer?
      get() = __410348101_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_ActiveControllerWhenMenuIsSuppressed(value: RadialController?): Unit {
      val fnPtr = _410348101_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__410348101_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_ActiveControllerWhenMenuIsSuppressed(): RadialController? {
      val fnPtr = _410348101_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RadialController>()
      val hr = fn.invokeHR(arrayOf(__410348101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RadialController>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_IsMenuSuppressed(value: Boolean): Unit {
      val fnPtr = _410348101_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__410348101_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_IsMenuSuppressed(): Boolean {
      val fnPtr = _410348101_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__410348101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IRadialControllerConfiguration2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __410348101_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadialControllerConfiguration2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d577ef73cee11e6b535001bdc06ab3b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadialControllerConfiguration2(ptr: Pointer?): WithDefault =
        IRadialControllerConfiguration2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadialControllerConfiguration2 {
      val address = segment.toRawLongValue()
      return makeIRadialControllerConfiguration2(Pointer(address))
    }

    public override fun toNative(obj: IRadialControllerConfiguration2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__410348101_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadialControllerConfiguration2):
        Array<IRadialControllerConfiguration2?> = (elements as
        Array<IRadialControllerConfiguration2?>).castToImpl<IRadialControllerConfiguration2,IRadialControllerConfiguration2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadialControllerConfiguration2?> =
        arrayOfNulls<IRadialControllerConfiguration2_Impl>(size) as
        Array<IRadialControllerConfiguration2?>
  }
}
