package Windows.Foundation

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

@ABIMarker(IGuidHelperStatics.ABI::class)
@Signature("{59c7966b-ae52-5283-ad7f-a1b9e9678add}")
@Guid("59c7966bae525283ad7fa1b9e9678add")
@WinRTInterface("59c7966bae525283ad7fa1b9e9678add")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGuidHelperStatics.ByReference::class)
public interface IGuidHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateNewGuid(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_Empty(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(2)
  public fun Equals(target: com.sun.jna.platform.win32.Guid.GUID?,
      value: com.sun.jna.platform.win32.Guid.GUID?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGuidHelperStatics> {
    public override fun getValue() = ABI.makeIGuidHelperStatics(pointer.getPointer(0))

    public fun setValue(value: IGuidHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGuidHelperStatics {
    public val __1965750109_Ptr: Pointer?

    public val _1965750109_VtblPtr: Pointer?
      get() = __1965750109_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateNewGuid(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1965750109_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1965750109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Empty(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1965750109_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1965750109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun Equals(target: com.sun.jna.platform.win32.Guid.GUID?,
        value: com.sun.jna.platform.win32.Guid.GUID?): Boolean {
      val fnPtr = _1965750109_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1965750109_Ptr, marshalToNative(target),
          marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IGuidHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1965750109_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGuidHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("59c7966bae525283ad7fa1b9e9678add")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGuidHelperStatics(ptr: Pointer?): WithDefault = IGuidHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGuidHelperStatics {
      val address = segment.toRawLongValue()
      return makeIGuidHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: IGuidHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1965750109_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGuidHelperStatics): Array<IGuidHelperStatics?> =
        (elements as
        Array<IGuidHelperStatics?>).castToImpl<IGuidHelperStatics,IGuidHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGuidHelperStatics?> =
        arrayOfNulls<IGuidHelperStatics_Impl>(size) as Array<IGuidHelperStatics?>
  }
}
