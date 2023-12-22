package Windows.Data.Json

import Windows.Data.Json.IJsonObject.ABI.IID
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

@ABIMarker(IJsonObjectWithDefaultValues.ABI::class)
@Signature("{d960d2a2-b7f0-4f00-8e44-d82cf415ea13}")
@Guid("d960d2a2b7f04f008e44d82cf415ea13")
@WinRTInterface("d960d2a2b7f04f008e44d82cf415ea13")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IJsonObjectWithDefaultValues.ByReference::class)
public interface IJsonObjectWithDefaultValues : NativeMapped, IWinRTInterface, IJsonObject,
    IJsonValue {
  @InterfaceMethod(0)
  public fun GetNamedValue(name: String?, defaultValue: JsonValue?): JsonValue?

  @InterfaceMethod(1)
  public fun GetNamedObject(name: String?, defaultValue: JsonObject?): JsonObject?

  @InterfaceMethod(2)
  public fun GetNamedString(name: String?, defaultValue: String?): String?

  @InterfaceMethod(3)
  public fun GetNamedArray(name: String?, defaultValue: JsonArray?): JsonArray?

  @InterfaceMethod(4)
  public fun GetNamedNumber(name: String?, defaultValue: Double): Double

  @InterfaceMethod(5)
  public fun GetNamedBoolean(name: String?, defaultValue: Boolean): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IJsonObjectWithDefaultValues> {
    public override fun getValue() = ABI.makeIJsonObjectWithDefaultValues(pointer.getPointer(0))

    public fun setValue(value: IJsonObjectWithDefaultValues_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IJsonObjectWithDefaultValues, IJsonObject.WithDefault,
      IJsonValue.WithDefault {
    public val __1293226642_Ptr: Pointer?

    public val _1293226642_VtblPtr: Pointer?
      get() = __1293226642_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetNamedValue(name: String?, defaultValue: JsonValue?): JsonValue? {
      val fnPtr = _1293226642_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<JsonValue>()
      val hr = fn.invokeHR(arrayOf(__1293226642_Ptr, marshalToNative(name),
          marshalToNative(defaultValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<JsonValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetNamedObject(name: String?, defaultValue: JsonObject?): JsonObject? {
      val fnPtr = _1293226642_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<JsonObject>()
      val hr = fn.invokeHR(arrayOf(__1293226642_Ptr, marshalToNative(name),
          marshalToNative(defaultValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<JsonObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetNamedString(name: String?, defaultValue: String?): String? {
      val fnPtr = _1293226642_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1293226642_Ptr, marshalToNative(name),
          marshalToNative(defaultValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetNamedArray(name: String?, defaultValue: JsonArray?): JsonArray? {
      val fnPtr = _1293226642_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<JsonArray>()
      val hr = fn.invokeHR(arrayOf(__1293226642_Ptr, marshalToNative(name),
          marshalToNative(defaultValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<JsonArray>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetNamedNumber(name: String?, defaultValue: Double): Double {
      val fnPtr = _1293226642_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1293226642_Ptr, marshalToNative(name), defaultValue, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun GetNamedBoolean(name: String?, defaultValue: Boolean): Boolean {
      val fnPtr = _1293226642_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1293226642_Ptr, marshalToNative(name), defaultValue, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IJsonObjectWithDefaultValues_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IJsonObject, IJsonValue {
    public override val __40167919_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1293226642_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1531753665_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IJsonValue.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1293226642_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1293226642_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IJsonObjectWithDefaultValues, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d960d2a2b7f04f008e44d82cf415ea13")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIJsonObjectWithDefaultValues(ptr: Pointer?): WithDefault =
        IJsonObjectWithDefaultValues_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IJsonObjectWithDefaultValues {
      val address = segment.toRawLongValue()
      return makeIJsonObjectWithDefaultValues(Pointer(address))
    }

    public override fun toNative(obj: IJsonObjectWithDefaultValues): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1293226642_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IJsonObjectWithDefaultValues):
        Array<IJsonObjectWithDefaultValues?> = (elements as
        Array<IJsonObjectWithDefaultValues?>).castToImpl<IJsonObjectWithDefaultValues,IJsonObjectWithDefaultValues_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJsonObjectWithDefaultValues?> =
        arrayOfNulls<IJsonObjectWithDefaultValues_Impl>(size) as
        Array<IJsonObjectWithDefaultValues?>
  }
}
