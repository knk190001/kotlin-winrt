package Windows.Storage

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

@ABIMarker(ISystemPhotoProperties.ABI::class)
@Signature("{4734fc3d-ab21-4424-b735-f4353a56c8fc}")
@Guid("4734fc3dab214424b735f4353a56c8fc")
@WinRTInterface("4734fc3dab214424b735f4353a56c8fc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemPhotoProperties.ByReference::class)
public interface ISystemPhotoProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CameraManufacturer(): String?

  @InterfaceMethod(1)
  public fun get_CameraModel(): String?

  @InterfaceMethod(2)
  public fun get_DateTaken(): String?

  @InterfaceMethod(3)
  public fun get_Orientation(): String?

  @InterfaceMethod(4)
  public fun get_PeopleNames(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemPhotoProperties> {
    public override fun getValue() = ABI.makeISystemPhotoProperties(pointer.getPointer(0))

    public fun setValue(value: ISystemPhotoProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemPhotoProperties {
    public val __1898106915_Ptr: Pointer?

    public val _1898106915_VtblPtr: Pointer?
      get() = __1898106915_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CameraManufacturer(): String? {
      val fnPtr = _1898106915_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1898106915_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CameraModel(): String? {
      val fnPtr = _1898106915_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1898106915_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DateTaken(): String? {
      val fnPtr = _1898106915_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1898106915_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Orientation(): String? {
      val fnPtr = _1898106915_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1898106915_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_PeopleNames(): String? {
      val fnPtr = _1898106915_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1898106915_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ISystemPhotoProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1898106915_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemPhotoProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4734fc3dab214424b735f4353a56c8fc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemPhotoProperties(ptr: Pointer?): WithDefault =
        ISystemPhotoProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemPhotoProperties {
      val address = segment.toRawLongValue()
      return makeISystemPhotoProperties(Pointer(address))
    }

    public override fun toNative(obj: ISystemPhotoProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1898106915_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemPhotoProperties): Array<ISystemPhotoProperties?> =
        (elements as
        Array<ISystemPhotoProperties?>).castToImpl<ISystemPhotoProperties,ISystemPhotoProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemPhotoProperties?> =
        arrayOfNulls<ISystemPhotoProperties_Impl>(size) as Array<ISystemPhotoProperties?>
  }
}
