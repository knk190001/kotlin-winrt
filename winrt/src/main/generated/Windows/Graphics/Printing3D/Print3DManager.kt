package Windows.Graphics.Printing3D

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(Print3DManager.ABI::class)
@Signature("rc(Windows.Graphics.Printing3D.Print3DManager;{4d2fcb0a-7366-4971-8bd5-17c4e3e8c6c0})")
@WinRTByReference(brClass = Print3DManager.ByReference::class)
public class Print3DManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrint3DManager.WithDefault, IWinRTObject {
  private val __982993498_Interface: IPrint3DManager.WithDefault by lazy {
    as_982993498()
  }


  public override val __982993498_Ptr: JNAPointer? by lazy {
    __982993498_Interface.__982993498_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__982993498_Interface)

  private fun as_982993498(): IPrint3DManager.WithDefault {
    if(pointer == NULL) {
      return(IPrint3DManager.ABI.makeIPrint3DManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrint3DManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrint3DManager.ABI.makeIPrint3DManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Print3DManager>
      {
    public override fun getValue() = Print3DManager(pointer.getPointer(0))

    public fun setValue(value: Print3DManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Print3DManager, MemoryAddress> {
    public val IPrint3DManagerStatics_Instance: IPrint3DManagerStatics by lazy {
      createIPrint3DManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPrint3DManagerStatics(): IPrint3DManagerStatics {
      val refiid = Guid.REFIID(IPrint3DManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing3D.Print3DManager".toHandle(),refiid,interfacePtr)
      val result = IPrint3DManagerStatics.ABI.makeIPrint3DManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Print3DManager {
      val address = segment.toRawLongValue()
      return Print3DManager(Pointer(address))
    }

    public override fun toNative(obj: Print3DManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() = ABI.IPrint3DManagerStatics_Instance.GetForCurrentView()

    public fun ShowPrintUIAsync() = ABI.IPrint3DManagerStatics_Instance.ShowPrintUIAsync()
  }
}
