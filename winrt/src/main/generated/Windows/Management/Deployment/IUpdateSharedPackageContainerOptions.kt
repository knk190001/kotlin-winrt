package Windows.Management.Deployment

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

@ABIMarker(IUpdateSharedPackageContainerOptions.ABI::class)
@Signature("{80672e83-7194-59f9-b5b9-daa5375f130a}")
@Guid("80672e83719459f9b5b9daa5375f130a")
@WinRTInterface("80672e83719459f9b5b9daa5375f130a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUpdateSharedPackageContainerOptions.ByReference::class)
public interface IUpdateSharedPackageContainerOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ForceAppShutdown(): Boolean

  @InterfaceMethod(1)
  public fun put_ForceAppShutdown(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_RequirePackagesPresent(): Boolean

  @InterfaceMethod(3)
  public fun put_RequirePackagesPresent(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUpdateSharedPackageContainerOptions> {
    public override fun getValue() =
        ABI.makeIUpdateSharedPackageContainerOptions(pointer.getPointer(0))

    public fun setValue(value: IUpdateSharedPackageContainerOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUpdateSharedPackageContainerOptions {
    public val __1665316177_Ptr: Pointer?

    public val _1665316177_VtblPtr: Pointer?
      get() = __1665316177_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ForceAppShutdown(): Boolean {
      val fnPtr = _1665316177_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1665316177_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_ForceAppShutdown(value: Boolean): Unit {
      val fnPtr = _1665316177_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1665316177_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_RequirePackagesPresent(): Boolean {
      val fnPtr = _1665316177_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1665316177_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_RequirePackagesPresent(value: Boolean): Unit {
      val fnPtr = _1665316177_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1665316177_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUpdateSharedPackageContainerOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1665316177_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUpdateSharedPackageContainerOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("80672e83719459f9b5b9daa5375f130a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUpdateSharedPackageContainerOptions(ptr: Pointer?): WithDefault =
        IUpdateSharedPackageContainerOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUpdateSharedPackageContainerOptions {
      val address = segment.toRawLongValue()
      return makeIUpdateSharedPackageContainerOptions(Pointer(address))
    }

    public override fun toNative(obj: IUpdateSharedPackageContainerOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1665316177_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUpdateSharedPackageContainerOptions):
        Array<IUpdateSharedPackageContainerOptions?> = (elements as
        Array<IUpdateSharedPackageContainerOptions?>).castToImpl<IUpdateSharedPackageContainerOptions,IUpdateSharedPackageContainerOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUpdateSharedPackageContainerOptions?> =
        arrayOfNulls<IUpdateSharedPackageContainerOptions_Impl>(size) as
        Array<IUpdateSharedPackageContainerOptions?>
  }
}
