package Windows.ApplicationModel.Resources.Core

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IMapView
import Windows.Storage.IStorageFile
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

@ABIMarker(IResourceManager.ABI::class)
@Signature("{f744d97b-9988-44fb-abd6-5378844cfa8b}")
@Guid("f744d97b998844fbabd65378844cfa8b")
@WinRTInterface("f744d97b998844fbabd65378844cfa8b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceManager.ByReference::class)
public interface IResourceManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MainResourceMap(): ResourceMap?

  @InterfaceMethod(1)
  public fun get_AllResourceMaps(): IMapView<String?, ResourceMap?>?

  @InterfaceMethod(2)
  public fun get_DefaultContext(): ResourceContext?

  @InterfaceMethod(3)
  public fun LoadPriFiles(files: IIterable<IStorageFile?>?): Unit

  @InterfaceMethod(4)
  public fun UnloadPriFiles(files: IIterable<IStorageFile?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceManager> {
    public override fun getValue() = ABI.makeIResourceManager(pointer.getPointer(0))

    public fun setValue(value: IResourceManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceManager {
    public val __1279705448_Ptr: Pointer?

    public val _1279705448_VtblPtr: Pointer?
      get() = __1279705448_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MainResourceMap(): ResourceMap? {
      val fnPtr = _1279705448_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceMap>()
      val hr = fn.invokeHR(arrayOf(__1279705448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceMap>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AllResourceMaps(): IMapView<String?, ResourceMap?>? {
      val fnPtr = _1279705448_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, ResourceMap?>>()
      val hr = fn.invokeHR(arrayOf(__1279705448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, ResourceMap?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DefaultContext(): ResourceContext? {
      val fnPtr = _1279705448_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceContext>()
      val hr = fn.invokeHR(arrayOf(__1279705448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceContext>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun LoadPriFiles(files: IIterable<IStorageFile?>?): Unit {
      val fnPtr = _1279705448_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1279705448_Ptr, marshalToNative(files),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun UnloadPriFiles(files: IIterable<IStorageFile?>?): Unit {
      val fnPtr = _1279705448_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1279705448_Ptr, marshalToNative(files),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IResourceManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1279705448_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f744d97b998844fbabd65378844cfa8b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceManager(ptr: Pointer?): WithDefault = IResourceManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceManager {
      val address = segment.toRawLongValue()
      return makeIResourceManager(Pointer(address))
    }

    public override fun toNative(obj: IResourceManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1279705448_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceManager): Array<IResourceManager?> = (elements as
        Array<IResourceManager?>).castToImpl<IResourceManager,IResourceManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceManager?> =
        arrayOfNulls<IResourceManager_Impl>(size) as Array<IResourceManager?>
  }
}
