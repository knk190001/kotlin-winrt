package Windows.System

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(UserPicker.ABI::class)
@Signature("rc(Windows.System.UserPicker;{7d548008-f1e3-4a6c-8ddc-a9bb0f488aed})")
@WinRTByReference(brClass = UserPicker.ByReference::class)
public class UserPicker(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserPicker.WithDefault, IWinRTObject {
  private val __1350531864_Interface: IUserPicker.WithDefault by lazy {
    as_1350531864()
  }


  public override val __1350531864_Ptr: JNAPointer? by lazy {
    __1350531864_Interface.__1350531864_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1350531864_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1350531864(): IUserPicker.WithDefault {
    if(pointer == NULL) {
      return(IUserPicker.ABI.makeIUserPicker(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserPicker>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserPicker.ABI.makeIUserPicker(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<UserPicker> {
    public override fun getValue() = UserPicker(pointer.getPointer(0))

    public fun setValue(value: UserPicker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserPicker, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IUserPickerStatics_Instance: IUserPickerStatics by lazy {
      createIUserPickerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.System.UserPicker".toHandle(), refiid,
          iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIUserPickerStatics(): IUserPickerStatics {
      val refiid = Guid.REFIID(IUserPickerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.UserPicker".toHandle(),refiid,interfacePtr)
      val result = IUserPickerStatics.ABI.makeIUserPickerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): UserPicker {
      val address = segment.toRawLongValue()
      return UserPicker(Pointer(address))
    }

    public override fun toNative(obj: UserPicker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsSupported() = ABI.IUserPickerStatics_Instance.IsSupported()
  }
}
