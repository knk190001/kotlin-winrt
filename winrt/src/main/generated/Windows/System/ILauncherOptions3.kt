package Windows.System

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

@ABIMarker(ILauncherOptions3.ABI::class)
@Signature("{f0770655-4b63-4e3a-9107-4e687841923a}")
@Guid("f07706554b634e3a91074e687841923a")
@WinRTInterface("f07706554b634e3a91074e687841923a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILauncherOptions3.ByReference::class)
public interface ILauncherOptions3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IgnoreAppUriHandlers(): Boolean

  @InterfaceMethod(1)
  public fun put_IgnoreAppUriHandlers(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILauncherOptions3> {
    public override fun getValue() = ABI.makeILauncherOptions3(pointer.getPointer(0))

    public fun setValue(value: ILauncherOptions3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILauncherOptions3 {
    public val __1132038788_Ptr: Pointer?

    public val _1132038788_VtblPtr: Pointer?
      get() = __1132038788_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IgnoreAppUriHandlers(): Boolean {
      val fnPtr = _1132038788_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1132038788_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IgnoreAppUriHandlers(value: Boolean): Unit {
      val fnPtr = _1132038788_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1132038788_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILauncherOptions3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1132038788_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILauncherOptions3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f07706554b634e3a91074e687841923a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILauncherOptions3(ptr: Pointer?): WithDefault = ILauncherOptions3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILauncherOptions3 {
      val address = segment.toRawLongValue()
      return makeILauncherOptions3(Pointer(address))
    }

    public override fun toNative(obj: ILauncherOptions3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1132038788_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILauncherOptions3): Array<ILauncherOptions3?> = (elements
        as Array<ILauncherOptions3?>).castToImpl<ILauncherOptions3,ILauncherOptions3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILauncherOptions3?> =
        arrayOfNulls<ILauncherOptions3_Impl>(size) as Array<ILauncherOptions3?>
  }
}
