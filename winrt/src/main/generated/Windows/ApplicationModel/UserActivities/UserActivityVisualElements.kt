package Windows.ApplicationModel.UserActivities

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(UserActivityVisualElements.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserActivities.UserActivityVisualElements;{94757513-262f-49ef-bbbf-9b75d2e85250})")
@WinRTByReference(brClass = UserActivityVisualElements.ByReference::class)
public class UserActivityVisualElements(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserActivityVisualElements.WithDefault,
    IUserActivityVisualElements2.WithDefault, IWinRTObject {
  private val __1947743096_Interface: IUserActivityVisualElements.WithDefault by lazy {
    as_1947743096()
  }


  private val __250493882_Interface: IUserActivityVisualElements2.WithDefault by lazy {
    as_250493882()
  }


  public override val __1947743096_Ptr: JNAPointer? by lazy {
    __1947743096_Interface.__1947743096_Ptr
  }


  public override val __250493882_Ptr: JNAPointer? by lazy {
    __250493882_Interface.__250493882_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1947743096_Interface, __250493882_Interface)

  private fun as_1947743096(): IUserActivityVisualElements.WithDefault {
    if(pointer == NULL) {
      return(IUserActivityVisualElements.ABI.makeIUserActivityVisualElements(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserActivityVisualElements>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserActivityVisualElements.ABI.makeIUserActivityVisualElements(ref.value))
  }

  private fun as_250493882(): IUserActivityVisualElements2.WithDefault {
    if(pointer == NULL) {
      return(IUserActivityVisualElements2.ABI.makeIUserActivityVisualElements2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserActivityVisualElements2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserActivityVisualElements2.ABI.makeIUserActivityVisualElements2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserActivityVisualElements> {
    public override fun getValue() = UserActivityVisualElements(pointer.getPointer(0))

    public fun setValue(value: UserActivityVisualElements): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserActivityVisualElements, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserActivityVisualElements {
      val address = segment.toRawLongValue()
      return UserActivityVisualElements(Pointer(address))
    }

    public override fun toNative(obj: UserActivityVisualElements): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
