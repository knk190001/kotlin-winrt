package Windows.Management.Deployment

import Windows.Foundation.Collections.IVector
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

@ABIMarker(ICreateSharedPackageContainerOptions.ABI::class)
@Signature("{c2ab6ece-f664-5c8e-a4b3-2a33276d3dde}")
@Guid("c2ab6ecef6645c8ea4b32a33276d3dde")
@WinRTInterface("c2ab6ecef6645c8ea4b32a33276d3dde")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICreateSharedPackageContainerOptions.ByReference::class)
public interface ICreateSharedPackageContainerOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Members(): IVector<SharedPackageContainerMember?>?

  @InterfaceMethod(1)
  public fun get_ForceAppShutdown(): Boolean

  @InterfaceMethod(2)
  public fun put_ForceAppShutdown(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_CreateCollisionOption(): SharedPackageContainerCreationCollisionOptions?

  @InterfaceMethod(4)
  public fun put_CreateCollisionOption(value: SharedPackageContainerCreationCollisionOptions?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICreateSharedPackageContainerOptions> {
    public override fun getValue() =
        ABI.makeICreateSharedPackageContainerOptions(pointer.getPointer(0))

    public fun setValue(value: ICreateSharedPackageContainerOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICreateSharedPackageContainerOptions {
    public val __538738174_Ptr: Pointer?

    public val _538738174_VtblPtr: Pointer?
      get() = __538738174_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Members(): IVector<SharedPackageContainerMember?>? {
      val fnPtr = _538738174_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<SharedPackageContainerMember?>>()
      val hr = fn.invokeHR(arrayOf(__538738174_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<SharedPackageContainerMember?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ForceAppShutdown(): Boolean {
      val fnPtr = _538738174_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__538738174_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_ForceAppShutdown(value: Boolean): Unit {
      val fnPtr = _538738174_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__538738174_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_CreateCollisionOption():
        SharedPackageContainerCreationCollisionOptions? {
      val fnPtr = _538738174_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SharedPackageContainerCreationCollisionOptions>()
      val hr = fn.invokeHR(arrayOf(__538738174_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SharedPackageContainerCreationCollisionOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override
        fun put_CreateCollisionOption(value: SharedPackageContainerCreationCollisionOptions?):
        Unit {
      val fnPtr = _538738174_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__538738174_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICreateSharedPackageContainerOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __538738174_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICreateSharedPackageContainerOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c2ab6ecef6645c8ea4b32a33276d3dde")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICreateSharedPackageContainerOptions(ptr: Pointer?): WithDefault =
        ICreateSharedPackageContainerOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICreateSharedPackageContainerOptions {
      val address = segment.toRawLongValue()
      return makeICreateSharedPackageContainerOptions(Pointer(address))
    }

    public override fun toNative(obj: ICreateSharedPackageContainerOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__538738174_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICreateSharedPackageContainerOptions):
        Array<ICreateSharedPackageContainerOptions?> = (elements as
        Array<ICreateSharedPackageContainerOptions?>).castToImpl<ICreateSharedPackageContainerOptions,ICreateSharedPackageContainerOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICreateSharedPackageContainerOptions?> =
        arrayOfNulls<ICreateSharedPackageContainerOptions_Impl>(size) as
        Array<ICreateSharedPackageContainerOptions?>
  }
}
