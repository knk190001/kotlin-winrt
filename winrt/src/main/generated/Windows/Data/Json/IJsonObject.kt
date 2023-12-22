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

@ABIMarker(IJsonObject.ABI::class)
@Signature("{064e24dd-29c2-4f83-9ac1-9ee11578beb3}")
@Guid("064e24dd29c24f839ac19ee11578beb3")
@WinRTInterface("064e24dd29c24f839ac19ee11578beb3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IJsonObject.ByReference::class)
public interface IJsonObject : NativeMapped, IWinRTInterface, IJsonValue {
  @InterfaceMethod(0)
  public fun GetNamedValue(name: String?): JsonValue?

  @InterfaceMethod(1)
  public fun SetNamedValue(name: String?, value: IJsonValue?): Unit

  @InterfaceMethod(2)
  public fun GetNamedObject(name: String?): JsonObject?

  @InterfaceMethod(3)
  public fun GetNamedArray(name: String?): JsonArray?

  @InterfaceMethod(4)
  public fun GetNamedString(name: String?): String?

  @InterfaceMethod(5)
  public fun GetNamedNumber(name: String?): Double

  @InterfaceMethod(6)
  public fun GetNamedBoolean(name: String?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IJsonObject> {
    public override fun getValue() = ABI.makeIJsonObject(pointer.getPointer(0))

    public fun setValue(value: IJsonObject_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IJsonObject, IJsonValue.WithDefault {
    public val __40167919_Ptr: Pointer?

    public val _40167919_VtblPtr: Pointer?
      get() = __40167919_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetNamedValue(name: String?): JsonValue? {
      val fnPtr = _40167919_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<JsonValue>()
      val hr = fn.invokeHR(arrayOf(__40167919_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<JsonValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetNamedValue(name: String?, value: IJsonValue?): Unit {
      val fnPtr = _40167919_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__40167919_Ptr, marshalToNative(name), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetNamedObject(name: String?): JsonObject? {
      val fnPtr = _40167919_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<JsonObject>()
      val hr = fn.invokeHR(arrayOf(__40167919_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<JsonObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetNamedArray(name: String?): JsonArray? {
      val fnPtr = _40167919_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<JsonArray>()
      val hr = fn.invokeHR(arrayOf(__40167919_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<JsonArray>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetNamedString(name: String?): String? {
      val fnPtr = _40167919_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__40167919_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetNamedNumber(name: String?): Double {
      val fnPtr = _40167919_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__40167919_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun GetNamedBoolean(name: String?): Boolean {
      val fnPtr = _40167919_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__40167919_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IJsonObject_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IJsonValue {
    public override val __1531753665_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_40167919_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __40167919_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IJsonObject, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("064e24dd29c24f839ac19ee11578beb3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIJsonObject(ptr: Pointer?): WithDefault = IJsonObject_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IJsonObject {
      val address = segment.toRawLongValue()
      return makeIJsonObject(Pointer(address))
    }

    public override fun toNative(obj: IJsonObject): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__40167919_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IJsonObject): Array<IJsonObject?> = (elements as
        Array<IJsonObject?>).castToImpl<IJsonObject,IJsonObject_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJsonObject?> =
        arrayOfNulls<IJsonObject_Impl>(size) as Array<IJsonObject?>
  }
}
