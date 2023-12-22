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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISharedPackageContainerManager.ABI::class)
@Signature("{be353068-1ef7-5ac8-ab3f-0b9f612f0274}")
@Guid("be3530681ef75ac8ab3f0b9f612f0274")
@WinRTInterface("be3530681ef75ac8ab3f0b9f612f0274")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISharedPackageContainerManager.ByReference::class)
public interface ISharedPackageContainerManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateContainer(name: String?, options: CreateSharedPackageContainerOptions?):
      CreateSharedPackageContainerResult?

  @InterfaceMethod(1)
  public fun DeleteContainer(id: String?, options: DeleteSharedPackageContainerOptions?):
      DeleteSharedPackageContainerResult?

  @InterfaceMethod(2)
  public fun GetContainer(id: String?): SharedPackageContainer?

  @InterfaceMethod(3)
  public fun FindContainers(): IVector<SharedPackageContainer?>?

  @InterfaceMethod(4)
  public fun FindContainers(options: FindSharedPackageContainerOptions?):
      IVector<SharedPackageContainer?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISharedPackageContainerManager> {
    public override fun getValue() = ABI.makeISharedPackageContainerManager(pointer.getPointer(0))

    public fun setValue(value: ISharedPackageContainerManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISharedPackageContainerManager {
    public val __1605325737_Ptr: Pointer?

    public val _1605325737_VtblPtr: Pointer?
      get() = __1605325737_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateContainer(name: String?,
        options: CreateSharedPackageContainerOptions?): CreateSharedPackageContainerResult? {
      val fnPtr = _1605325737_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CreateSharedPackageContainerResult>()
      val hr = fn.invokeHR(arrayOf(__1605325737_Ptr, marshalToNative(name),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CreateSharedPackageContainerResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun DeleteContainer(id: String?, options: DeleteSharedPackageContainerOptions?):
        DeleteSharedPackageContainerResult? {
      val fnPtr = _1605325737_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeleteSharedPackageContainerResult>()
      val hr = fn.invokeHR(arrayOf(__1605325737_Ptr, marshalToNative(id), marshalToNative(options),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeleteSharedPackageContainerResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetContainer(id: String?): SharedPackageContainer? {
      val fnPtr = _1605325737_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SharedPackageContainer>()
      val hr = fn.invokeHR(arrayOf(__1605325737_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SharedPackageContainer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun FindContainers(): IVector<SharedPackageContainer?>? {
      val fnPtr = _1605325737_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<SharedPackageContainer?>>()
      val hr = fn.invokeHR(arrayOf(__1605325737_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<SharedPackageContainer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun FindContainers(options: FindSharedPackageContainerOptions?):
        IVector<SharedPackageContainer?>? {
      val fnPtr = _1605325737_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<SharedPackageContainer?>>()
      val hr = fn.invokeHR(arrayOf(__1605325737_Ptr, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<SharedPackageContainer?>>(result.getValue())
      return resultValue
    }
  }

  public class ISharedPackageContainerManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1605325737_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISharedPackageContainerManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("be3530681ef75ac8ab3f0b9f612f0274")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISharedPackageContainerManager(ptr: Pointer?): WithDefault =
        ISharedPackageContainerManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISharedPackageContainerManager {
      val address = segment.toRawLongValue()
      return makeISharedPackageContainerManager(Pointer(address))
    }

    public override fun toNative(obj: ISharedPackageContainerManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1605325737_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISharedPackageContainerManager):
        Array<ISharedPackageContainerManager?> = (elements as
        Array<ISharedPackageContainerManager?>).castToImpl<ISharedPackageContainerManager,ISharedPackageContainerManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISharedPackageContainerManager?> =
        arrayOfNulls<ISharedPackageContainerManager_Impl>(size) as
        Array<ISharedPackageContainerManager?>
  }
}
