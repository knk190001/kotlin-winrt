package Windows.ApplicationModel.UserDataTasks

import Windows.Foundation.DateTime
import Windows.Foundation.IReference
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUserDataTaskRegenerationProperties.ABI::class)
@Signature("{92ab0007-090e-4704-bb5c-84fc0b0d9c31}")
@Guid("92ab0007090e4704bb5c84fc0b0d9c31")
@WinRTInterface("92ab0007090e4704bb5c84fc0b0d9c31")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataTaskRegenerationProperties.ByReference::class)
public interface IUserDataTaskRegenerationProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Unit(): UserDataTaskRegenerationUnit?

  @InterfaceMethod(1)
  public fun put_Unit(value: UserDataTaskRegenerationUnit?): Unit

  @InterfaceMethod(2)
  public fun get_Occurrences(): IReference<Int>?

  @InterfaceMethod(3)
  public fun put_Occurrences(value: IReference<Int>?): Unit

  @InterfaceMethod(4)
  public fun get_Until(): IReference<DateTime?>?

  @InterfaceMethod(5)
  public fun put_Until(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(6)
  public fun get_Interval(): Int

  @InterfaceMethod(7)
  public fun put_Interval(value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataTaskRegenerationProperties> {
    public override fun getValue() =
        ABI.makeIUserDataTaskRegenerationProperties(pointer.getPointer(0))

    public fun setValue(value: IUserDataTaskRegenerationProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataTaskRegenerationProperties {
    public val __1111210706_Ptr: Pointer?

    public val _1111210706_VtblPtr: Pointer?
      get() = __1111210706_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Unit(): UserDataTaskRegenerationUnit? {
      val fnPtr = _1111210706_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTaskRegenerationUnit>()
      val hr = fn.invokeHR(arrayOf(__1111210706_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTaskRegenerationUnit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Unit(value: UserDataTaskRegenerationUnit?): Unit {
      val fnPtr = _1111210706_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1111210706_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Occurrences(): IReference<Int>? {
      val fnPtr = _1111210706_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1111210706_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Occurrences(value: IReference<Int>?): Unit {
      val fnPtr = _1111210706_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1111210706_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Until(): IReference<DateTime?>? {
      val fnPtr = _1111210706_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__1111210706_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Until(value: IReference<DateTime?>?): Unit {
      val fnPtr = _1111210706_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1111210706_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Interval(): Int {
      val fnPtr = _1111210706_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1111210706_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_Interval(value: Int): Unit {
      val fnPtr = _1111210706_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1111210706_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUserDataTaskRegenerationProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1111210706_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataTaskRegenerationProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("92ab0007090e4704bb5c84fc0b0d9c31")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataTaskRegenerationProperties(ptr: Pointer?): WithDefault =
        IUserDataTaskRegenerationProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataTaskRegenerationProperties {
      val address = segment.toRawLongValue()
      return makeIUserDataTaskRegenerationProperties(Pointer(address))
    }

    public override fun toNative(obj: IUserDataTaskRegenerationProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1111210706_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataTaskRegenerationProperties):
        Array<IUserDataTaskRegenerationProperties?> = (elements as
        Array<IUserDataTaskRegenerationProperties?>).castToImpl<IUserDataTaskRegenerationProperties,IUserDataTaskRegenerationProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataTaskRegenerationProperties?> =
        arrayOfNulls<IUserDataTaskRegenerationProperties_Impl>(size) as
        Array<IUserDataTaskRegenerationProperties?>
  }
}
