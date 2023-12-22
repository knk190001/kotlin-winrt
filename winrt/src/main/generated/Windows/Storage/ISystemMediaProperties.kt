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

@ABIMarker(ISystemMediaProperties.ABI::class)
@Signature("{a42b3316-8415-40dc-8c44-98361d235430}")
@Guid("a42b3316841540dc8c4498361d235430")
@WinRTInterface("a42b3316841540dc8c4498361d235430")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemMediaProperties.ByReference::class)
public interface ISystemMediaProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Duration(): String?

  @InterfaceMethod(1)
  public fun get_Producer(): String?

  @InterfaceMethod(2)
  public fun get_Publisher(): String?

  @InterfaceMethod(3)
  public fun get_SubTitle(): String?

  @InterfaceMethod(4)
  public fun get_Writer(): String?

  @InterfaceMethod(5)
  public fun get_Year(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemMediaProperties> {
    public override fun getValue() = ABI.makeISystemMediaProperties(pointer.getPointer(0))

    public fun setValue(value: ISystemMediaProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemMediaProperties {
    public val __585919247_Ptr: Pointer?

    public val _585919247_VtblPtr: Pointer?
      get() = __585919247_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Duration(): String? {
      val fnPtr = _585919247_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__585919247_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Producer(): String? {
      val fnPtr = _585919247_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__585919247_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Publisher(): String? {
      val fnPtr = _585919247_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__585919247_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SubTitle(): String? {
      val fnPtr = _585919247_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__585919247_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Writer(): String? {
      val fnPtr = _585919247_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__585919247_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Year(): String? {
      val fnPtr = _585919247_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__585919247_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ISystemMediaProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __585919247_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemMediaProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a42b3316841540dc8c4498361d235430")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemMediaProperties(ptr: Pointer?): WithDefault =
        ISystemMediaProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemMediaProperties {
      val address = segment.toRawLongValue()
      return makeISystemMediaProperties(Pointer(address))
    }

    public override fun toNative(obj: ISystemMediaProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__585919247_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemMediaProperties): Array<ISystemMediaProperties?> =
        (elements as
        Array<ISystemMediaProperties?>).castToImpl<ISystemMediaProperties,ISystemMediaProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemMediaProperties?> =
        arrayOfNulls<ISystemMediaProperties_Impl>(size) as Array<ISystemMediaProperties?>
  }
}
