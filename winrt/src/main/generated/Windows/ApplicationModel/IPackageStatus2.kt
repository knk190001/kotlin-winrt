package Windows.ApplicationModel

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

@ABIMarker(IPackageStatus2.ABI::class)
@Signature("{f428fa93-7c56-4862-acfa-abaedcc0694d}")
@Guid("f428fa937c564862acfaabaedcc0694d")
@WinRTInterface("f428fa937c564862acfaabaedcc0694d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageStatus2.ByReference::class)
public interface IPackageStatus2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsPartiallyStaged(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageStatus2> {
    public override fun getValue() = ABI.makeIPackageStatus2(pointer.getPointer(0))

    public fun setValue(value: IPackageStatus2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageStatus2 {
    public val __1766035585_Ptr: Pointer?

    public val _1766035585_VtblPtr: Pointer?
      get() = __1766035585_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsPartiallyStaged(): Boolean {
      val fnPtr = _1766035585_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1766035585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPackageStatus2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1766035585_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageStatus2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f428fa937c564862acfaabaedcc0694d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageStatus2(ptr: Pointer?): WithDefault = IPackageStatus2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageStatus2 {
      val address = segment.toRawLongValue()
      return makeIPackageStatus2(Pointer(address))
    }

    public override fun toNative(obj: IPackageStatus2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1766035585_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageStatus2): Array<IPackageStatus2?> = (elements as
        Array<IPackageStatus2?>).castToImpl<IPackageStatus2,IPackageStatus2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageStatus2?> =
        arrayOfNulls<IPackageStatus2_Impl>(size) as Array<IPackageStatus2?>
  }
}
