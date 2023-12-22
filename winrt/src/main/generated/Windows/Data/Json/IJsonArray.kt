package Windows.Data.Json

import Windows.Data.Json.IJsonValue.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IJsonArray.ABI::class)
@Signature("{08c1ddb6-0cbd-4a9a-b5d3-2f852dc37e81}")
@Guid("08c1ddb60cbd4a9ab5d32f852dc37e81")
@WinRTInterface("08c1ddb60cbd4a9ab5d32f852dc37e81")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IJsonArray.ByReference::class)
public interface IJsonArray : NativeMapped, IWinRTInterface, IJsonValue {
  @InterfaceMethod(0)
  public fun GetObjectAt(index: WinDef.UINT): JsonObject?

  @InterfaceMethod(1)
  public fun GetArrayAt(index: WinDef.UINT): JsonArray?

  @InterfaceMethod(2)
  public fun GetStringAt(index: WinDef.UINT): String?

  @InterfaceMethod(3)
  public fun GetNumberAt(index: WinDef.UINT): Double

  @InterfaceMethod(4)
  public fun GetBooleanAt(index: WinDef.UINT): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IJsonArray> {
    public override fun getValue() = ABI.makeIJsonArray(pointer.getPointer(0))

    public fun setValue(value: IJsonArray_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IJsonArray, IJsonValue.WithDefault {
    public val __1512871337_Ptr: Pointer?

    public val _1512871337_VtblPtr: Pointer?
      get() = __1512871337_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetObjectAt(index: WinDef.UINT): JsonObject? {
      val fnPtr = _1512871337_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<JsonObject>()
      val hr = fn.invokeHR(arrayOf(__1512871337_Ptr, index, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<JsonObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetArrayAt(index: WinDef.UINT): JsonArray? {
      val fnPtr = _1512871337_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<JsonArray>()
      val hr = fn.invokeHR(arrayOf(__1512871337_Ptr, index, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<JsonArray>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetStringAt(index: WinDef.UINT): String? {
      val fnPtr = _1512871337_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1512871337_Ptr, index, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetNumberAt(index: WinDef.UINT): Double {
      val fnPtr = _1512871337_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1512871337_Ptr, index, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun GetBooleanAt(index: WinDef.UINT): Boolean {
      val fnPtr = _1512871337_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1512871337_Ptr, index, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IJsonArray_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IJsonValue {
    public override val __1531753665_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1512871337_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1512871337_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IJsonArray, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("08c1ddb60cbd4a9ab5d32f852dc37e81")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIJsonArray(ptr: Pointer?): WithDefault = IJsonArray_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IJsonArray {
      val address = segment.toRawLongValue()
      return makeIJsonArray(Pointer(address))
    }

    public override fun toNative(obj: IJsonArray): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1512871337_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IJsonArray): Array<IJsonArray?> = (elements as
        Array<IJsonArray?>).castToImpl<IJsonArray,IJsonArray_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJsonArray?> = arrayOfNulls<IJsonArray_Impl>(size)
        as Array<IJsonArray?>
  }
}
